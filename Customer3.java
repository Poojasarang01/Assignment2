package com.yash.oops;

public class Customer3 {
	    int accountno;
		String custName,custAddress;
		String custDob;
		String custAccount_openingDate;
		Branch3 branch;
		public Customer3(int accountno, String custName, String custAddress, String custDob,
				String custAccount_openingDate, Branch3 branch) {
			super();
			this.accountno = accountno;
			this.custName = custName;
			this.custAddress = custAddress;
			this.custDob = custDob;
			this.custAccount_openingDate = custAccount_openingDate;
			this.branch = branch;
		}
		
		void displayCustomerDetails()
		{
			
			System.out.println("Account ccountno is : "+accountno);
			System.out.println("Custname is : "+custName);
			System.out.println("Cust_address is : "+custAddress);
			System.out.println("Cust_dob is : "+custDob);
			System.out.println("Cust_account_opening_date is : "+custAccount_openingDate);
			
			System.out.println("Branch_id is : "+branch.branch_id);
			System.out.println("Branch_name is : "+branch.branchName);
			System.out.println("Branch_address is : "+branch.branchAddress);


		}
		
}
