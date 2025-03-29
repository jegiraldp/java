package iterator.contacts;

public class Contacto {
    private String nombre;
    private int phoneNumber;
    private String email;
    
    public Contacto(String nombre, int phoneNumber, String email) {
        this.nombre = nombre;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }

    
    
}
