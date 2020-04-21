package com.vs.gc;

public class Test {
  public static void main (String[] args) {
	  Test t1 =new Test();
	  Test t2 =new Test();
	  //Created a new two objects
	  //Null the Reference variable
	  t1 =null;
	  //Requesting Jvm for running Garbage Collector
	  System.gc();
	  //Nullifing the Reference variable 
	  t2 =null;
	  Runtime.getRuntime().gc();
  }
  protected void finalize() {
	  System.out.println("Garbage Collector is called");
	  System.out.println("Object garbage collected:"+this);
  }
}
