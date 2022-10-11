package com.yash.oops;



public class EmpolyeeTask9 implements Cloneable
{
int eid;
String name;
double salary;
String department;

public EmpolyeeTask9(int eid, String name, double salary, String department) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
	this.department = department;
}

public static void main(String[] args) throws CloneNotSupportedException 
{
	EmpolyeeTask9 e1=new EmpolyeeTask9(101, "Pooja", 90000, "CSE");
	
	
System.out.println("USING Base Object ");
System.out.println("EID ="+e1.eid);
System.out.println("EName ="+e1.name);
System.out.println("Esalary ="+e1.eid);
System.out.println("Emp dept ="+ e1.department);

EmpolyeeTask9 e2=(EmpolyeeTask9) e1.clone();

System.out.println("After clone Object ");
System.out.println("EID ="+e2.eid);
System.out.println("EName ="+e2.name);
System.out.println("Esalary ="+e2.eid);
System.out.println("Emp dept ="+ e2.department);

System.out.println("e1 hashcode ="+e1.hashCode());
System.out.println("e2 hashcode ="+e2.hashCode());





System.out.println(e1==e2);
	
	
}
}

