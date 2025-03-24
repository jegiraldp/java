package builder.house;

public class SingleHouseConstructor implements iConstructor{

    
    @Override
    public void setBases() {
        System.out.println("Bases de casa soltero: ok");
    }

    @Override
    public void setObraNegra() {
        System.out.println("Obra negra de casa soltero: ok");
    }

    @Override
    public void setObraBlanca() {
        System.out.println("Obra blanca de casa soltero: ok");
    }
    
}
