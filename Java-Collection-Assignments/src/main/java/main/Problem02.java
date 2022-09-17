package main;

import db.EmployeeDB;

import java.util.List;

public class Problem02 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        List<Employee> employeeList = employee.getEmployeeDetails();
        employee.printEmployeeDetails(employeeList);
        System.out.println("--------------------------------------------------------------------------------------------");
        EmployeeDB employeeDB = new EmployeeDB();
        employeeDB.addEmployee(new Employee(1, "Pooja", "mali.pooja@gmail.com", 'F', 15000));
        employeeDB.addEmployee(new Employee(2, "Mahesh", "patil.mahesh@gmail.com", 'M', 20000));
        Employee[] employees = employeeDB.listAll();
        employeeDB.displayEmployee(employees);
        String string = employeeDB.showPaySlip(2);
        System.out.println(string);
        boolean check = employeeDB.deleteEmployee(2);
        if(check){
            System.out.println("Employee is deleted successfully");
        }else {
            System.out.println("Employee is not deleted");
        }

    }
}
