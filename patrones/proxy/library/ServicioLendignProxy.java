package proxy.library;

public class ServicioLendignProxy implements iLendingService{
    @SuppressWarnings("unused")
    private iLendingService theService;

    @Override
    public void returnBookMsg() {
       System.out.println("Proxy: Reporte a finanzas");
    }

    public ServicioLendignProxy() {
        this.theService = new LenderStudent(123);
    }

    
    
}
