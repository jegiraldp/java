import java.util.LinkedList;
import java.util.List;

public final class InmutablePerson {
    private final String name;
    private final String lastName;
    private final List<String> emails;

    public InmutablePerson(String name, String lastName, List<String> emails) {
        this.name = name;
        this.lastName = lastName;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getEmails() {
        return new LinkedList<>(emails);
    }

    @Override
    public String toString() {
        return "InmutablePerson [name=" + name + ", lastName=" + lastName + ", emails=" + emails + "]";
    }

    

    
    
    
    
}
