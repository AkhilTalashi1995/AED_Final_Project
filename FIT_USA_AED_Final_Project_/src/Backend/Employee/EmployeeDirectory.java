/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Employee;
import Backend.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Aashay
 */
public class EmployeeDirectory {
     private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, Role role){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setRole(role);
        employeeList.add(employee);
        return employee;
    }
    
}
