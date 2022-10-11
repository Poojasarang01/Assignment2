package com.yash.oops;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StudentTask3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the accountno number : ");
		int accountno=sc.nextInt();
		
		System.out.println("Enter the custname is:");
		String custname=sc.next();
	
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter cust_dob date (dd/MM/yyyy):");
        String custDob = sc.next();

		System.out.println("Enter the cust_address is:");
		String custAddress=sc.next();
		
        System.out.println("Enter cust_account_opening_date date (dd/MM/yyyy):");
        String custAaccountOpeningDate = sc.next();
        
		System.out.println("Enter the branch_id is : ");
		int BID=sc.nextInt();
		
		System.out.println("Enter the branch_name is : ");
		String bname=sc.next();
		
		System.out.println("Enter the branch_address is : ");
		String branchAddress=sc.next();
		
		System.out.println("Enter the CAID is : ");
		int CAID=sc.nextInt();
		
		System.out.println("Enter the CustId is : ");
		int custId=sc.nextInt();
		
		System.out.println("Enter the amount is : ");
		int amount=sc.nextInt();
		
		System.out.println("Enter the deposit_withdrawl is : ");
		int depositWithdrawl=sc.nextInt();
		
		 System.out.println("Enter deposit_date date (dd/mm/yyyy):");
	        String depositDate = sc.next();
	       
	        Branch3 b = new Branch3(BID,bname,branchAddress);
			
	        Customer3 cust = new Customer3(accountno,custname,custAddress,custDob,custAaccountOpeningDate,
	        		b);
		       cust.displayCustomerDetails();		
	        
		CustomerAccountStatement3 c = new CustomerAccountStatement3(CAID,custId,amount,
				depositWithdrawl,depositDate);
		
		c.displayCustomerAccountStatementInfo();

	}

}

