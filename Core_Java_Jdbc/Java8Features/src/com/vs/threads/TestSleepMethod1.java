package com.vs.threads;

public class TestSleepMethod1 extends Thread {
	public void run() {
//		for (int i=1;i<5;i++) {
//			try {
//				Thread.sleep(100);
//			}
//			catch(InterruptedException e) {
//				System.out.println(e);
//				
//			}
//			 System.out.println(i); 
		
//		}
		
		System.out.println("Running Thread Name is "+Thread.currentThread().getName());
		System.out.println("Running Thread Prioritoy is"+Thread.currentThread().getPriority());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();
		//t1.start();
		System.out.println("Thread Name is "+t1.getName());
		t1.setName("PrasadVinukonda");
		System.out.println("Thread Name is "+t1.getName());
		t2.start();
		

	}

}
