package builder.laptop;

public class inicio {

    public static void main(String[] args) {
        LaptopConstructor gamer = LaptopConstructor.getResult();
        gamer.setMarca("Lenovo");
        gamer.setModelo(2023);
        gamer.setMemoria(15);

        System.out.println(gamer.toString());

        //
        DesktopConstructor gamer2 = DesktopConstructor.getResult();
        gamer2.setMarca("Clone");
        gamer2.setModelo(2020);
        gamer2.setMemoria(32);

        System.out.println(gamer2.toString());
        
    }
    
}
