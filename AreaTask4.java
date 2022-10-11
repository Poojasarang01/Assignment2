package com.yash.oops;

import java.util.Scanner;

public class AreaTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first side");
		int firstSide=sc.nextInt();
		System.out.println("Enter the second side");
		int secondSide=sc.nextInt();
		System.out.println("Enter the third side");
		int thirdSide=sc.nextInt();
		
		AreaTask4 a1=new AreaTask4();
		if(firstSide==secondSide|| secondSide==thirdSide||thirdSide==firstSide) 
		{
		    a1.areaOfSquare(firstSide, thirdSide, secondSide);}
	 
		else {
		System.out.println("not the square beacase side are diff");
	  }
		
		a1.areaOfRectangle(firstSide,secondSide,thirdSide);
		a1.areaOfTriangle(firstSide, secondSide, thirdSide);
		
	}
	void areaOfSquare(int a,int b,int c) {
		    int area_square=a*b;
		    area_square=b*c;
		    area_square=c*a;
	        System.out.println("The area of the square is if two side is same  "+ area_square); 
	        
		
	}
	
	void areaOfRectangle(int x,int y,int z) {
		int area_Rectangle=x*y;
		System.out.println("area of the Rectangle "+area_Rectangle);
		
	}
     void areaOfTriangle(int x,int y,int z) {
    	 int areaOfTriangle = (x*y*z)/2;
    	 isValidTriangle(x,y,z);
         System.out.println("The area of the Triangle is "+ areaOfTriangle);
         if(isValidTriangle(x,y,z)) {
            System.out.println("This Traingle is valid ");
         }
         else {
        	 System.out.println("It is a not valid traingle ");
         }
	}
     public static boolean isValidTriangle(int a, int b, int c) 
     {
    	  return (a + b > c && b + c > a && c + a > b);
    	 }
     
}
