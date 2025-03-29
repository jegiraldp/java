package iterator.contacts;

public class InicioContacts {

    public static void main(String[] args) {
        ContactList losContactos = new ContactList();
        losContactos.addContact(new Contacto("Jorge", 123, "jegiraldp@gmail.com"));
        losContactos.addContact(new Contacto("Jorge2", 321, "jegiraldp2@gmail.com"));

        ContactIterator iterator = (ContactIterator) losContactos.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
            
        }
    }
    
}
