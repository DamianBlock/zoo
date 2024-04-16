
package Modelo;


public class Empleado {
    
   private String nombre;
   private long documento;
   private String domicilio;
    
     public Empleado(String nombre, long documento, String domicilio) {
        this.nombre = nombre;
        this.documento = documento;
        this.domicilio = domicilio;
      
    }
     public String getNombre() {
         return nombre;
     }
     
     public void setNombre(String nombre){
     this.nombre = nombre;
     }
     
     public long getDocumento() {
         return documento;
     }
     
     public void setDocumento(long documento){
     this.documento = documento;
     }
     
     public String getDomicilio() {
         return domicilio;
     }
     
     public void setDomicilio(String domicilio){
     this.domicilio = domicilio;
     }
}
