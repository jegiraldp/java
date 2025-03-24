package builder.house;

public class InicioHouse {

    public static void main(String[] args) {
        
        iConstructor casaFamiliar = new FamilyHouseConstructor();
        casaFamiliar.setBases();
        casaFamiliar.setObraNegra();
        casaFamiliar.setObraBlanca();

        System.out.println("///////////////");
        iConstructor casaSoltero = new SingleHouseConstructor();
        casaSoltero.setBases();
        casaSoltero.setObraNegra();
        casaSoltero.setObraBlanca();

    }
    
}
