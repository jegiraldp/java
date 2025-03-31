package repository.databaseuno.main;

import repository.databaseuno.util.DatabaseConnection;
import repository.databaseuno.model.Employee;
import repository.databaseuno.repository.EmployeeRepository;
import repository.databaseuno.repository.iRepository;

public class InicioDatabase {

    public static void main(String[] args) {
        System.out.println(DatabaseConnection.getDatabaseConnection());
        iRepository repo = new EmployeeRepository();
        System.out.println("-----------------FindAll");
        repo.findAll().forEach(System.out::println);
        System.out.println("-----------------getById");
        System.out.println(repo.getById(1));
        System.out.println("-----------------Save");
        Employee e = new Employee(3,"J3","G3","jegiraldp3@gmail.com",20000);
        repo.save(e);
        repo.findAll().forEach(System.out::println);
        System.out.println("-----------------Delete");
        repo.delete(2);
        repo.findAll().forEach(System.out::println);
        
    }
    
}
