package com.hungtdo.demo.javase;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class IOScanner2 {

	public static void main(String args[]) throws IOException {
        //Đầu tiên là khai báo một Scanner như sau:
        Scanner inputReader = new Scanner(System.in);
        //Để lấy vào một chuỗi làm như sau:
        System.out.print("Please enter your name: ");
        String name="";//<<=== Chú ý
        name = inputReader.next();
        //Để lấy vào một số kiêu int làm như sau:
        System.out.print("Please enter your birth year:");
        int number = inputReader.nextInt();
        //Để lấy vào một số kiểu float làm như sau:
        System.out.print("Please enter your average mark: ");
        float decimal = inputReader.nextFloat();
        inputReader.close();
        System.out.println("INFORMATION");
        System.out.println("Name:         "+name);
        System.out.println("Birth year:   "+number);
        System.out.println("Average Mark: "+decimal);
 
        //Để lấy thông tin bằng JOptionPane, các bạn chỉ cần làm việc sau:
        String input = JOptionPane.showInputDialog("Enter any number of your choice");
        System.out.println("JOptionPane input: " + input);
	}
        
}
