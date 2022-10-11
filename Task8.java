package com.yash.oops;


public class Task8 {

	@Override
	protected void finalize() {
		System.out.println("Finalize called");
	
	}
	public static void main(String[] args) {
		Task8 obj = new Task8();   
	        System.out.println(obj.hashCode());   
	        obj = null;   
	            
	        System.gc();   
	        System.out.println("end of garbage collection");   
	}

}

