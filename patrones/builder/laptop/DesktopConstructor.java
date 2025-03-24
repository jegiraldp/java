package builder.laptop;

public class DesktopConstructor implements iConstructor  {

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

    public static DesktopConstructor getResult(){
        return new DesktopConstructor();
    }

    @Override
    public String toString() {
        return "DesktopConstructor [marca=" + marca + ", modelo=" + modelo + ", memoria=" + memoria + "]";
    }

    
    
}
