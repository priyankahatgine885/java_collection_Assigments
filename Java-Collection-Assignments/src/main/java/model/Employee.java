package model;

import lombok.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private int emp_id;
    private String name;
    private String email;
    private char gender;
    private float salary;

    public List<Employee> getEmployeeDetails(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "priyanka", "mali.priyanka@gmail.com", 'F', 20000));
        employeeList.add(new Employee(2, "ajay", "patil.ajay@gmail.com", 'M', 10000));
        employeeList.add(new Employee(3, "akshay", "patil.akshay@gmail.com", 'M', 30000));
        employeeList.add(new Employee(4, "mrunali", "nikam.mrunali@gmail.com", 'F', 15000));
        return employeeList;
    }
    public  void printEmployeeDetails(List<Employee> employeeList){
        Iterator<Employee> it = employeeList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
