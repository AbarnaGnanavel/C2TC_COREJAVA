package com.tns.ifet.dayfive;

public class Students extends Citizen {
		private int rollNo;
		private String collegeName;

		public  Students() {
		super();
		}
		public  Students(String name, String aadharNo, String address, String phone, int rollNo, String collegeName) {
			super(name, aadharNo, address, phone); 
			this.rollNo = rollNo;
			this.collegeName = collegeName;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
					+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhone()+ "]";
		}

		

	
}
