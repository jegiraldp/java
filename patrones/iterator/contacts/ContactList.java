package iterator.contacts;

import java.util.ArrayList;
import java.util.List;

public class ContactList implements iLista {

    private List<Contacto> theContacts;

    public ContactList() {
        this.theContacts = new ArrayList<>();
    }

    public void addContact(Contacto c){
        theContacts.add(c);
    }



    @Override
    public iIterator createIterator() {
        return new ContactIterator(theContacts);
    }
    
}
