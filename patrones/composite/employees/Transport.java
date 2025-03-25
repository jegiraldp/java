package composite.employees;

public class Transport implements iEmployee{
    private int code;
    private String name;

    @Override
    public void viewDetails() {
        System.out.println(toString());
    }

    public Transport(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transport [code=" + code + ", name=" + name + "]";
    }


    
}
