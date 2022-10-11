package com.yash.oops;

public class Branch3{
	int branch_id;
	String branchName,branchAddress;
	Branch3()
	{
		System.out.println("default constructor : ");
	 }
	public Branch3(int branch_id, String branchName, String branchAddress) {
		super();
		this.branch_id = branch_id;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
	}
	void displayBranch()
	{
		System.out.println("the branch_id is :- "+branch_id);
		System.out.println("the branch_name is:-  "+branchName);
		System.out.println("the branch_address is :-  "+branchAddress);
	}
	
}

