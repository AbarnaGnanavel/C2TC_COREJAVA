package com.tns.ifet.dayfive;
public class HierarchicalInhDemo  {
	public static void main(String[] args) {
		

		Person p1 = new Person();
		System.out.println("Person Details "+p1);
		
		Person p2  = new Person();
		if (p2 instanceof Person)
			System.out.println("Person Details "+p2);
		
		
		Employee e= new Employee();
		if (e instanceof Employee)
		System.out.println("Employee Details "+e);
		

		Student student= new Student("Pankaj", "Pune", "FE", 88);
		if (student instanceof Student)
			System.out.println("Student Details "+student);

	}

} 
