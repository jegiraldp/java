package repository.databaseuno.model;

public class Employee {

    private int code;
    private String firstName;
    private String lastName;
    private String email;
    private int salary;

    public Employee() {
    }

    public Employee(int code, String firstName, String lastName, String email, int salary) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.salary = salary;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [code=" + code + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", salary=" + salary + "]";
    }

    

    

    
}
