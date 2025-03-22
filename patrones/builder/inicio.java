package builder;

public class inicio {

    public static void main(String[] args) {
        LaptopConstructor gamer = LaptopConstructor.getResult();
        gamer.setMarca("Lenovo");
        gamer.setModelo(2023);
        gamer.setMemoria(15);

        System.out.println(gamer.toString());
    
        
    }
    
}
