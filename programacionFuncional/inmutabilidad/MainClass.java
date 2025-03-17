import java.util.LinkedList;
import java.util.List;

public class MainClass {
   public static void main(String[] args) {
    List<String> theEmails = new LinkedList<>();
    theEmails.add("correo1@gmail.com");

    MutablePerson p1 = new MutablePerson();
    p1.setEmails(theEmails);
    p1.setName("Jorge");
    p1.setLastname("Giraldo");
    //
    System.out.println("///////////////");
    System.out.println(p1);
    badFunction(p1);
    System.out.println(p1);
    //
    System.out.println("///////////////");
    MutablePerson2 p2 = new MutablePerson2(theEmails);
    p2.setName("Jorge2");
    p2.setLastName("Giraldo2");
    System.out.println(p2);
    otherBadFunction(p2);
    System.out.println(p2);
    ///
    System.out.println("///////////////");
    MutablePerson3 p3 = new MutablePerson3(theEmails);
    p3.setFirstName("Jorge3");
    p3.setLastName("Giraldo3");
    System.out.println(p3);
    otherBadFunction3(p3);
    System.out.println(p3);
     ///
    System.out.println("///////////////");
    MutablePerson3 p4 = new MutablePerson3(theEmails);
    p4.setFirstName("Jorge4");
    p4.setLastName("Giraldo4");
    System.out.println(p4);

    ///
    System.out.println("/////////////// Inmutable");
    List<String> theEmailsImp = new LinkedList<>();
    theEmailsImp.add("correo1@gmail.com");
    InmutablePerson ip = new InmutablePerson("JorgeInm", "GiraldoInm", theEmailsImp);
    System.out.println(ip);
    badIntention(ip);
    System.out.println(ip);
   }

   static void badFunction(MutablePerson mp){
    List<String> theEmailsChanged = new LinkedList<>();
    theEmailsChanged.add("changed@gmail.com");
    mp.setEmails(theEmailsChanged);
   }

   static void otherBadFunction(MutablePerson2 mp){
    List<String> theMails = mp.getEmails();
    theMails.clear();
    theMails.add("jajaChanged@gmail.com");
   }

   static void otherBadFunction3(MutablePerson3 mp){
    List<String> spamEmails = new LinkedList<>();
    spamEmails.add("jiji@gmail.com");
    spamEmails.add("kakaka@gmail.com");
    List<String> emails = mp.getEmails();
    emails.clear();
    emails.add("unCorreoSpam@gmail.com");
    emails.addAll(spamEmails);
   }

   static void badIntention(InmutablePerson imp){
    List<String> theMails = imp.getEmails();
    theMails.clear();
    theMails.add("jajaChanged@gmail.com");
   }
    
    
}

