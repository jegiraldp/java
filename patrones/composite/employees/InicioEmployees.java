package composite.employees;

public class InicioEmployees {

    public static void main(String[] args) {
        
        Warehouse we = new Warehouse(11,"Jorge Warehouse");
        Transport te = new Transport(12, "Jorge Trnasport");
        Coordinator ce = new Coordinator(01, "Jorge Coordinator");

        we.viewDetails();
        te.viewDetails();
        System.out.println("//////////");
        
        ce.addEmployee(we);
        ce.addEmployee(te);
        ce.viewDetails();

        System.out.println("//////////");
        ce.removeEmployee(te);
        ce.viewDetails();

    }
    
}
