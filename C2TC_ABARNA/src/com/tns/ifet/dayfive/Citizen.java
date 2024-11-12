package com.tns.ifet.dayfive;

public class Citizen {
	private String name;
	private String aadharNo;
	private String address;
	private String phone;
	
	public Citizen() {
		System.out.println("Citizen object created");
	}
	public Citizen(String name, String aadharNo, String address, String phone) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", phone=" + phone + "]";
	}
	

}
