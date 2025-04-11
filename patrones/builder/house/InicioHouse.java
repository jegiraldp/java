package builder.house;

public class InicioHouse {

    public static void main(String[] args) {
        
        FamilyHouseConstructor casaFamiliar = new FamilyHouseConstructor();
        casaFamiliar.setBases();
        casaFamiliar.setObraNegra();
        casaFamiliar.setObraBlanca();

        System.out.println("///////////////");
        SingleHouseConstructor casaSoltero = new SingleHouseConstructor();
        casaSoltero.setBases();
        casaSoltero.setObraNegra();
        casaSoltero.setObraBlanca();

    }
    
}
