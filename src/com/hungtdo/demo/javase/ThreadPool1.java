package com.hungtdo.demo.javase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool1 {

    private BlockingQueue<Runnable> taskQueue = null;
    private List<PoolThread> threads = new ArrayList<PoolThread>();
    private boolean isStopped = false;

    public ThreadPool1(int noOfThreads, int maxNoOfTasks){
        taskQueue = new ArrayBlockingQueue<Runnable>(maxNoOfTasks);

        for(int i=1; i<=noOfThreads; i++){
        	PoolThread t = new PoolThread(taskQueue);
        	t.setName("Thread: " + i);
            threads.add(t);
        }
        for(PoolThread thread : threads){
            thread.start();
        }
    }

    public synchronized void  execute(Runnable task) throws Exception{
        if(this.isStopped) throw
            new IllegalStateException("ThreadPool is stopped");

        this.taskQueue.add(task);
    }

    public synchronized void stop(){
        this.isStopped = true;
        for(PoolThread thread : threads){
           thread.stop();
        }
    }
    
    private int task = 1;
    
    private Runnable getTask() {
    	return new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() + "; Task:" + task);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				task++;
			}
		};
    }
    
	public static void main(String[] args) {
		// 2 thread, 5 tasks
		ThreadPool1 threadPool1 = new ThreadPool1(3, 5);
		for (int i = 1; i <= 5; i++) {
			try {
				threadPool1.execute(threadPool1.getTask());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    
    public class PoolThread extends Thread {

        private BlockingQueue<Runnable> taskQueue = null;
        private boolean isStopped = false;

		public PoolThread(BlockingQueue<Runnable> queue) {
			taskQueue = queue;
		}

        public void run(){
            while(!isStopped()){
                try{
                    Runnable runnable = (Runnable) taskQueue.poll();
                    if(runnable != null) {
                    	runnable.run();
                    }
                } catch(Exception e){
                    //log or otherwise report exception,
                    //but keep pool thread alive.
                }
            }
        }

        public synchronized void doStop(){
            isStopped = true;
            this.interrupt(); //break pool thread out of dequeue() call.
        }

        public synchronized boolean isStopped(){
            return isStopped;
        }
    }

}
