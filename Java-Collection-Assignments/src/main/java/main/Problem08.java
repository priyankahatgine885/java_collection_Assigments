package main;

import model.Employee;

import java.util.Iterator;
import java.util.Vector;

public class Problem08 {
    public static void main(String[] args) {
        Vector<Employee> employeeVector = new Vector<>();
        employeeVector.add(new Employee(1, "Janaki", "patil.janki@gmail.com", 'F', 20000));
        employeeVector.add(new Employee(2, "Sagar", "patil.sagar@gmail.com", 'M', 10000));
        employeeVector.add(new Employee(3, "Pratik", "sutar.pratik@gmail.com", 'M', 15000));
        listAll(employeeVector);
    }

    private static void listAll(Vector<Employee> employeeVector) {
        Iterator<Employee> iterator = employeeVector.iterator();
        while ((iterator.hasNext())){

        }
    }

}
