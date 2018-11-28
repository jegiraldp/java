
public class casa {
    
    private String cod;
    private int consumoLuz;
    static casa[] casas;
    
    static void iniciarDatos(){
        casas = new casa[5];
        
        for (int i = 0; i < casas.length; i++) {
            casas[i]= new casa(String.valueOf(i+1), 0);
            
        }//for
        
    }//iniciarDatos

    public casa(String cod, int consumoLuz) {
        this.cod = cod;
        this.consumoLuz = consumoLuz;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getConsumoLuz() {
        return consumoLuz;
    }

    public void setConsumoLuz(int consumoLuz) {
        this.consumoLuz = consumoLuz;
    }

    public static casa[] getCasas() {
        return casas;
    }

    public static void setCasas(casa[] casas) {
        casa.casas = casas;
    }

   
    
}//class
