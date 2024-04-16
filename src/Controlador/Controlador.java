package Controlador;

import Vista.vistaAnimal;
import Vista.vistaZoologico;


public class Controlador {
    
    //METODOS == TIENEN PARÉNTESIS Y CORCHETES
    //ATRIBUTOS == NO TIENEN PARÉNTESIS O CORCHETES
    //USAMOS STATIC PARA PODER HACER USO DE ATRIBUTOS Y MÉTODOS SIN INSTANCIAR EL CONTROLADOR
    public static vistaZoologico vistaZoologico;
    public static vistaAnimal vistaAnimal;
    
    
  public static void  iniciarCarga(){
  crearVistaZoologico();
  }
  
  public static void cerrarSistema(){
      System.exit(0);
  }
  
  public static void crearVistaZoologico(){
      vistaZoologico = new vistaZoologico();
      vistaZoologico.setVisible(true);
  }
  
    public static void crearVistaAnimal(){
      vistaAnimal = new vistaAnimal();
      vistaAnimal.setVisible(true);
  }
}
