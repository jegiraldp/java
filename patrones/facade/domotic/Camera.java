package facade.domotic;

public class Camera implements iDevice {
    private int code;
    private String name;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Camera(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public void on() {
      System.out.println("Camera "+name+" On");
    }

    @Override
    public void off() {
        System.out.println("Camera "+name+" Off");
    }

    @Override
    public void viewDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Camera [code=" + code + ", name=" + name + "]";
    }

    
    
}
