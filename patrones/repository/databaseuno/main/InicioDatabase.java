package repository.databaseuno.main;

import repository.databaseuno.util.DatabaseConnection;
import repository.databaseuno.repository.EmployeeRepository;
import repository.databaseuno.repository.iRepository;

public class InicioDatabase {

    public static void main(String[] args) {
        System.out.println(DatabaseConnection.getDatabaseConnection());
        iRepository repo = new EmployeeRepository();
        repo.findAll().forEach(System.out::println);
    }
    
}
