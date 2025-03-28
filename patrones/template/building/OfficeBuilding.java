package template.building;

public class OfficeBuilding extends Building {

    public OfficeBuilding(String name, String typeBuilding){
        this.name=name;
        this.typeBuilding=typeBuilding;
    }

    @Override
    void prepairGround() {
       System.out.println("Preparing Ground to "+typeBuilding+" "+name);
    }

    @Override
    void buildFoundations() {
        System.out.println("Building foundations to "+typeBuilding+" "+name);
    }

    @Override
    void builWalls() {
        System.out.println("Building Walls to "+typeBuilding+" "+name);
    }
    
}
