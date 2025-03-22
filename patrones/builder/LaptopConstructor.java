package builder;

public class LaptopConstructor implements iConstructor {

    private String marca;
    private int modelo;
    private int memoria;

   
    @Override
    public void setMarca(String marca) {
        this.marca=marca;
        
    }

    @Override
    public void setModelo(int modelo) {
       this.modelo=modelo;
    }

    @Override
    public void setMemoria(int memoria) {
       this.memoria=memoria;
    }

    public static LaptopConstructor getResult(){
        return new LaptopConstructor();
    }

    @Override
    public String toString() {
        return "LaptopConstructor [marca=" + marca + ", modelo=" + modelo + ", memoria=" + memoria + "]";
    }

    
    
}
