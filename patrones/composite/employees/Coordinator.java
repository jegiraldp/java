package composite.employees;

import java.util.ArrayList;
import java.util.List;

public class Coordinator implements iEmployee{
    private int code;
    private String name;
    private List<iEmployee> employees;



    public Coordinator(int code, String name) {
        this.code = code;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    @Override
    public void viewDetails() {
        employees.forEach(iEmployee::viewDetails);
    }

    public void addEmployee(iEmployee employee){
        employees.add(employee);
    }

    public void removeEmployee(iEmployee employee){
        employees.remove(employee);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
    
    
}