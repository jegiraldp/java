package proxy.library;

public class ServicioLendignProxy implements iLendingService{
    private iLendingService theService;

    @Override
    public void returnBookMsg() {
       System.out.println("Proxy: Reporte a finanzas");
    }

    public ServicioLendignProxy() {
        this.theService = new LenderStudent(123);
    }

    
    
}
