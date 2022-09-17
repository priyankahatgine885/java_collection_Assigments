package db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
    List<Employee> employeeDb = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return employeeDb.add(e);
    }

    public boolean deleteEmployee(int empId) {
        boolean isRemoved = false;

        Iterator<Employee> it = employeeDb.iterator();

        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getEmp_id() == empId) {
                isRemoved = true;
                it.remove();
            }
        }

        return isRemoved;
    }

    public String showPaySlip(int empId) {
        String paySlip = "Invalid employee id";

        for (Employee e : employeeDb) {
            if (e.getEmp_id() == empId) {
                paySlip = "Pay slip for employee id " + empId + " is " +
                        e.getSalary();
            }
        }

        return paySlip;
    }

    public Employee[] listAll() {
        Employee[] empArray = new Employee[employeeDb.size()];
        for (int i = 0; i < employeeDb.size(); i++)
            empArray[i] = employeeDb.get(i);
        return empArray;
    }
    public void displayEmployee(Employee[] employees){
        for (int i = 0; i< employees.length; i++){
            System.out.println(employees[i]);
        }
    }

}
