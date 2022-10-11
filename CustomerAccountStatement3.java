package com.yash.oops;




public class CustomerAccountStatement3 {
	int CAID,custId, amount, depositWithdrawl;
	String depositDate;
	
	CustomerAccountStatement3()
	{
		System.out.println("default student constructor : ");
	}

	public CustomerAccountStatement3(int cAID, int custId, int amount, int depositWithdrawl, String depositDate) {
		super();
		CAID = cAID;
		this.custId = custId;
		this.amount = amount;
		this.depositWithdrawl = depositWithdrawl;
		this.depositDate = depositDate;
	}
	void displayCustomerAccountStatementInfo()
	{
		System.out.println("the CAID is :-  "+CAID);
		System.out.println("the CustId is :-  "+custId);
		System.out.println("the amount is :-  "+amount);
		System.out.println("the deposit_withdrawl is :-  "+depositWithdrawl);
		System.out.println("the deposit_date is :- "+depositDate);
	}
}
