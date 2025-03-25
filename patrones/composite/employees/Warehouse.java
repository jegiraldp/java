package composite.employees;

public class Warehouse implements iEmployee{
    private int code;
    private String name;

    @Override
    public void viewDetails() {
        System.out.println(toString());
    }

    public Warehouse(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Warehouse [code=" + code + ", name=" + name + "]";
    }

    
}
