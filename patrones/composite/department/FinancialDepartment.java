public class FinancialDepartment implements iDepartment{
    private int id;
    private String name;

    @Override
    public void printDepartmentName() {
       System.out.println(toString());    
    }

    
    public FinancialDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "FinancialDepartment [id=" + id + ", name=" + name + "]";
    }

}
