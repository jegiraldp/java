package memento.employees;

public class MementoEmployees implements iMemento{

    private Employee employee;
    private String state;

    

    public MementoEmployees(Employee employee, String state) {
        this.employee = employee;
        this.state = state;
    }



    public Employee getEmployee() {
        return employee;
    }



    public String getState() {
        return state;
    }



    @Override
    public void restore() {
        employee.setState("active");
    }
    
}
