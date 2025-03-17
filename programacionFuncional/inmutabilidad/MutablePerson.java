import java.util.List;

public class MutablePerson{
    private String name;
    private String Lastname;
    private List<String> emails;

    
    public MutablePerson() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return Lastname;
    }
    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public List<String> getEmails() {
        return emails;
    }
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
    @Override
    public String toString() {
        return "MutablePerson [name=" + name + ", Lastname=" + Lastname + ", emails=" + emails + "]";
    }
    
  
    


}