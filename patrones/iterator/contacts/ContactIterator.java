package iterator.contacts;

import java.util.List;

public class ContactIterator implements iIterator {

    private int index=0;
    private List<Contacto> theContacts;

    

    public ContactIterator(List<Contacto> theContacts) {
        this.theContacts = theContacts;
    }

    @Override
    public boolean hasNext() {
       return index < theContacts.size();
    }

    @Override
    public Contacto next() {
        if(hasNext()) return theContacts.get(index++);
        return null;
    }

    public int getIndex() {
        return index;
    }

    public List<Contacto> getTheContacts() {
        return theContacts;
    }

    
    
}
