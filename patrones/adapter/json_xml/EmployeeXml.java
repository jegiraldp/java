package adapter.json_xml;

public class EmployeeXml {
    public String name;
    public int age;
    
    public EmployeeXml(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public String toXml(){
    return "<employee><name>" + name + "</name><age>" + age + "</age></employee>";
   }

    
    
}
