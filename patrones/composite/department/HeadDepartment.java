import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements iDepartment {

    private int id;
    private String name;
    private List<iDepartment> childDepartments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(iDepartment::printDepartmentName);
    }

    public void addDepartment(iDepartment department){
        childDepartments.add(department);
    }

    public void removeDepartment(iDepartment department){
        childDepartments.remove(department);
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

       
    
}
