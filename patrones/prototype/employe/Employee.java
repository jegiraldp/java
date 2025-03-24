package prototype.employe;

public abstract class Employee{

    public int code;
    public String name;

    public Employee(Employee target) {
        if(target != null){
            this.code=target.code;
            this.name= target.name;
        }
    }

    public abstract Employee clone();

    

}