package prototype.employe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inicioemployees {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<Employee> employeesCopie = new ArrayList<>();

        Fulltime e1 = new Fulltime();
        e1.code=123;
        e1.name="JorgeFullTime";
        e1.officeCode=143;
        
        Temporal e2 = new Temporal();
        e2.code=321;
        e2.name="JorgeTemporal";
        e2.numHours=18;

        employees.add(e1);
        employees.add(e2);

        Fulltime e3 = (Fulltime) e1.clone();
        Temporal e4 = (Temporal) e2.clone();

        employees.add(e3);
        employees.add(e4);        
        
        System.out.println("Employee List");
        employees.forEach(System.out::println);

        System.out.println("Employee List Copie");
        employeesCopie = employees.stream()
                        .map(Employee::clone)
                        .collect(Collectors.toList());
        employees.forEach(System.out::println);

    }
    
}
