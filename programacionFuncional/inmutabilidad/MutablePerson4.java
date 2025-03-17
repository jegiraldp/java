import java.util.LinkedList;
import java.util.List;

public class MutablePerson4 extends MutablePerson3 {

    public MutablePerson4(List<String> emails){
        super(emails);
    }

    @Override
    public List<String> getEmails() {
      List<String> spammEmails = new LinkedList<>();
        spammEmails.add("again@gmail.com");
        spammEmails.add("agan_jiji@gmail.com");

        return spammEmails;
    }

    
}
