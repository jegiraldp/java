public class Cedula {

    private int num;
    private int yearIssue;
    private static Cedula instancia; 

    private Cedula(int num, int yearIssue) {
        this.num = num;
        this.yearIssue = yearIssue;
    }

    public static Cedula getInstance(){
        
        if(instancia==null){
            System.out.println("Se crea y se retorna");
            instancia= new Cedula(302010,2026);
        }

        return instancia;
    }

    @Override
    public String toString() {
        return "Cedula [num=" + num + ", yearIssue=" + yearIssue + "]";
    }

    
}
