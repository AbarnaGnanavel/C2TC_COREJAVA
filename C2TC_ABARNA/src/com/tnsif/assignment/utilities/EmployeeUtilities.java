package com.tnsif.assignment.utilities;
import com.tnsif.assignment.employees.Employee;
import com.tnsif.assignment.employees.Manager;
import com.tnsif.assignment.employees.Developer;
public class EmployeeUtilities {

    /**
     * Prints the details of the employee.
     * @param employee The employee object.
     */
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        // Check if the employee is an instance of Manager or Developer and print specific details
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Department: " + manager.getDepartment());
        } else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
        System.out.println();
    }
}
