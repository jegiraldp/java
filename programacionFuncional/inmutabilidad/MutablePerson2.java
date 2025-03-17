import java.util.List;

public class MutablePerson2 {
    private String name;
    private String lastName;
    private List <String> emails;
    
    public MutablePerson2(List<String> emails) {
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        return "MutablePerson2 [name=" + name + ", lastName=" + lastName + ", emails=" + emails + "]";
    }

    
}
