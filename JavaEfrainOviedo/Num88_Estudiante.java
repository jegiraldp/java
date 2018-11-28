/**
* EJERCICIO RESUELTO No. 88
* @autor	Efrain Oviedo
* @libro	Logica de Programación
*
* 
*/


public class Num88_Estudiante {

        private String codigo;
        private String nombre;
        private String direccion;
        private int estado;

        public Num88_Estudiante(String codigo, String nombre, String direccion, int estado) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.direccion = direccion;
            this.estado = estado;
        }
        
        public String getCodigo() {
            return codigo;
        }
        
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        
        public String getDireccion() {
            return direccion;
        }
        
        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
        
        public int getEstado() {
            return estado;
        }
        
        public void setEstado(int estado) {
            this.estado = estado;
        }
        
        public String getNombre() {
            return nombre;
        }
        
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
} 
    

