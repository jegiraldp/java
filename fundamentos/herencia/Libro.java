/**
 * Clase para registrar los datos de un libro
 * @author  Amparo López Gaona
 * @version Abril 2006
 * @see Obra
 */
public class Libro extends Obra {
  private String editorial;

  /** Constructor de un libro
   * @param autor- nombre del autor del libro
   * @param título- título del libro
   * @param tema - tema de clasificación del libro
   * @param año - año de publicación del libro
   * @param ed - editorial del libro
   */
  public Libro(String autor, String título, String tema, int año, String ed){
    super(autor, título, tema, año);
    editorial = ed;
  }

  /**
   * Método para obtener la editorial del libro
   * @return String - editorial del libro
   */
  public String obtenerEditorial(){
    return editorial;
  }

  /** 
   * Método para asignar editorial al libro
   * @param ed - editorial del libro
   */
  public void asignarEditorial(String ed){
    editorial = (ed != null) ? ed : "Desconocida";
  }

  /**
   * Método para obtener una cadena con los datos del libro
   * @return String - cadena con los datos del libro
   */
  public String toString() {
    return super.toString() + "\t" + editorial;
  }
}

