package Manager;

import java.util.ArrayList;
import java.util.List;

public class Director {
    private List<Employees> employeeList;
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
        employeeList = new ArrayList<>();
    }

    public void addEmployee(int id, String name) {
        Employees employee = new Employees(id, name);
        employeeList.add(employee);
        System.out.printf("added %s(%d)\n", name, id);
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
            System.out.printf("removed %s(%d)\n", name, id);
        }
    }

    public void construct() {
        builder.makeTitle("EMPLOYEE LIST");
        String[] listItems = new String[employeeList.size()];
        for (int i = 0; i < employeeList.size(); i++) {
            Employees employee = employeeList.get(i);
            listItems[i] = "ID: " + employee.getId() + ", Name: " + employee.getName();
        }
        
        builder.makeList(listItems);
    }
    
    public List<Employees> getEmployeeList() {
        return employeeList;
    }
    

}