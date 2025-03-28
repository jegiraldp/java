package template.building;

public abstract class Building {
    String name;
    String typeBuilding;
   
    public void builStructure(){
        prepairGround();
        builStructure();
       // builWalls();
    }

    abstract void prepairGround();
    abstract void buildFoundations();
    abstract void builWalls();



    
}
