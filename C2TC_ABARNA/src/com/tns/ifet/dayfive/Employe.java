package com.tns.ifet.dayfive;

public class Employe extends Person {
	private String deptName;
	private double baseSalary;
	
	public Employe() {}

	public Employe(String deptName, double baseSalary) {
		super();
		this.deptName = deptName;
		this.baseSalary = baseSalary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Employe [deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
	}
	


}
