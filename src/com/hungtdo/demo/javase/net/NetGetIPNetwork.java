package com.hungtdo.demo.javase.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetGetIPNetwork {

	public static void main(String args[]) throws UnknownHostException {
		 
        InetAddress addr = InetAddress.getLocalHost();
 
        //Host IP Address
        String ipAddress = addr.getHostAddress();
        //Hostname
        String hostname = addr.getHostName();
        System.out.println("IP address of localhost from Java Program: " + ipAddress);
        System.out.println("Name of hostname : " + hostname);
 
    }

}
