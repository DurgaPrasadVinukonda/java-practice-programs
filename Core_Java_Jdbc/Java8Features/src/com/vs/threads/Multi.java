package com.vs.threads;

public class Multi extends Thread {
	public void run() {
		System.out.println("Thread is Running");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multi t1 = new Multi();
		t1.start();
	}

}
