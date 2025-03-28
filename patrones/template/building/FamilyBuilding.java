package template.building;

public class FamilyBuilding extends Building{

    public FamilyBuilding(String name, String typeBuilding){
        this.name=name;
        this.typeBuilding=typeBuilding;
    }

    @Override
    void prepairGround() {
       System.out.println("Preparing Ground to Families "+" "+name);
    }

    @Override
    void buildFoundations() {
        System.out.println("Building foundations to Families "+" "+name);
    }

    @Override
    void builWalls() {
        System.out.println("Building Walls to Families "+" "+name);
    }
    
}
