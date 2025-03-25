package facade.domotic;

public class Lamp implements iDevice{

    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Lamp(int code, String name) {
        this.code = code;
        this.name = name;
    }


    @Override
    public void on() {
      System.out.println("Lamp "+name+" On");
    }

    @Override
    public void off() {
        System.out.println("Lamp "+name+" Off");
    }

    @Override
    public void viewDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Lamp [code=" + code + ", name=" + name + "]";
    }

    
}
