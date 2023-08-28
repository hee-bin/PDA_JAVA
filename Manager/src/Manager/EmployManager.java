package Manager;

import java.util.ArrayList;
import java.util.List;

public class EmployManager {
    private List<Employees> employeeList;

    public EmployManager() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(int id, String name) {
        Employees employee = new Employees(id, name);
        employeeList.add(employee);
        System.out.printf("added  %s(%d)\n", name, id );

    }

    public void removeEmployee(int id, String name) {
        Employees employeeToRemove = null;
        for (Employees employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
            System.out.printf("removed %s( %d)\n. ", name, id );
        }
    }
    
    
    public List<Employees> getEmployeeList() {
        return employeeList;
    }

   
}