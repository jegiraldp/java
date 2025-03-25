public class SalesDepartment implements iDepartment {

    private int id;
    private String name;

    @Override
    public void printDepartmentName() {
        //System.out.println(getClass().getSimpleName());
        System.out.println(toString());  
    }

    

    public SalesDepartment(int id, String name) {
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



    @Override
    public String toString() {
        return "SalesDepartment [id=" + id + ", name=" + name + "]";
    }

    
    
}
