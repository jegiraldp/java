package repository.databaseuno.repository;


import java.util.ArrayList;
import java.util.List;

import repository.databaseuno.model.Employee;

public class EmployeeRepository implements iRepository<Employee> {
    private List<Employee> lista;
   

    public EmployeeRepository() {
        
        this.lista = new ArrayList<>();
        lista.add(new Employee(1,"J1","G1","jegiraldp1@gmail.com",10000));
        lista.add(new Employee(2,"J2","G2","jegiraldp2@gmail.com",20000));
    }

    @Override
    public List<Employee> findAll() {
     return lista;
    }

    @Override
    public Employee getById(int id) {
        for (Employee e : lista) {
           if(e.getCode()==id){
            return e;
           }
        }
        return null;
    }

    @Override
    public void save(Employee t) {
        System.out.println("Saved "+t.toString());
        lista.add(t);
    }

    @Override
    public void delete(int id) {
        for (Employee employee : lista) {
            if(employee.getCode()==id) lista.remove(employee);
        }
    }

    
    
    
}
