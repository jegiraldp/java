package repository.databaseuno.repository;


import java.util.ArrayList;
import java.util.List;

import repository.databaseuno.model.Employee;
import repository.databaseuno.util.DatabaseConnection;

public class EmployeeRepository implements iRepository<Employee> {
    private List<Employee> lista = new ArrayList<>();

    public String getConnection(){
        return DatabaseConnection.getDatabaseConnection();
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> lista = new ArrayList<>();
       lista.add(new Employee(1,"J1","G1","jegiraldp1@gmail.com",10000));
       lista.add(new Employee(2,"J2","G2","jegiraldp2@gmail.com",20000));
       return lista;
       
    }

    @Override
    public Employee getById(int id) {
        for (Employee e : lista) {
            if(e.getCode()==id) return e;
        }
        return null;
    }

    @Override
    public void save(Employee t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    
    
    
}
