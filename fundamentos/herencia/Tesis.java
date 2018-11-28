/**
 * Clase para registrar los datos de una tesis
 * @author  Amparo López Gaona
 * @version Abril 2006
 * @see Obra
 */
public class Tesis extends Obra {
  private String director;
  private String grado;

  /** Constructor de una tesis
   * @param autor- nombre del autor de la tesis
   * @param título- título de la tesis
   * @param tema - tema de clasificación de la tesis
   * @param año - año de publicación de la tesis
   * @param d - director de la tesis
   * @param g - grado 
   */
  public Tesis(String autor, String título, String tema, int año, String d,
               String g){
    super(autor, título, tema, año);
    director = d;
    grado = g;
  }

  /**
   * Método para obtener la director de la tesis
   * @return String - director de la tesis
   */
  public String obtenerDirector(){
    return director;
  }

  /** 
   * Método para asignar director a la tesis
   * @param ed - director de la tesis
   */
  public void asignarDirector(String d){
    director = (d != null) ? d : "Amparo López Gaona";
  }

  /**
   * Método para obtener la grado de la tesis
   * @return String - grado de la tesis
   */
  public String obtenerGrado(){
    return grado;
  }

  /** 
   * Método para asignar grado a la tesis
   * @param ed - grado de la tesis
   */
  public void asignarGrado(String g){
    grado = (g != null) ? g : "Licenciatura";
  }

  /**
   * Método para obtener una cadena con los datos de la tesis
   * @return String - cadena con los datos de la tesis
   */
  public String toString() {
    return super.toString() + "\t" + director +"\t" + grado;
  }
}
