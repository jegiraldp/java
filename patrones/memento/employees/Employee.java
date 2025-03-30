package memento.employees;

public class Employee implements iEmployee{
    private int code;
    private String name;
    private String state;


    public int getCode() {
        return code;
    }


    public String getName() {
        return name;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public Employee(int code, String name) {
        this.code = code;
        this.name = name;
        this.state="disabled";
    }


    @Override
    public Employee save() {
        return new Employee(this.code, this.name);
    }
    
}
