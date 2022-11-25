/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Employee;

import Backend.Role.Role;

/**
 *
 * @author Aashay
 */
public class Employee {
    private String ename;
    private int eid;
    private static int ecount = 1;
    private Role erole;
    
    
    public Employee() {
        eid = ecount;
        ecount++;
    }
    
    public String getName() {
        return ename;
    }

    public void setName(String ename) {
        this.ename = ename;
    }

    public int getId() {
        return eid;
    }

    public void setId(int eid) {
        this.eid = eid;
    }

    public Role getRole() {
        return erole;
    }

    public void setRole(Role erole) {
        this.erole = erole;
    }
     
    
    
    @Override
    public String toString() {
        return ename;
    }
}
