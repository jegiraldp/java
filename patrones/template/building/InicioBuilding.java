package template.building;

public class InicioBuilding {

    public static void main(String[] args) {
        System.out.println("-- Office Building -- ");
        Building b = new OfficeBuilding("OffiOne","Oficinas");
        b.builStructure();

       /* System.out.println("-- Family Building -- ");
        b = new FamilyBuilding("FamiOne","Family");
        b.builStructure();*/


    }
    
}
