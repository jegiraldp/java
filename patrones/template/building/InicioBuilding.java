package template.building;

public class InicioBuilding {

    public static void main(String[] args) {
        Building b; 
        System.out.println("-- Office Building -- ");
        b = new OfficeBuilding("OffiOne","Oficinas");
        b.builStructure();

        System.out.println("-- Family Building -- ");
        b = new FamilyBuilding("FamiOne","Family");
        b.builStructure();


    }
    
}
