package proxy.library;

public class inicioLibrary  {
    public static void main(String[] args) {
        LenderStudent student = new LenderStudent(123);
        ServicioLendignProxy proxy = new ServicioLendignProxy();
        student.returnBookMsg();
        int days=70;
       if (days>=15){
        proxy.returnBookMsg();
       } else{
        System.out.println("Fin del proceso");
       }

    }
    
}
