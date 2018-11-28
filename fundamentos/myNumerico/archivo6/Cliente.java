

package archivo6;

public class Cliente implements java.io.Serializable{
  private String nombre;
  private transient String passWord;
  public Cliente(String nombre, String pw) {
    this.nombre=nombre;
    passWord=pw;
  }
  public String toString(){
    String texto=(passWord==null) ? "(no disponible)" : passWord;
    texto+=nombre;
    return texto;
  }
} 