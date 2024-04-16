
package Controlador;

import Modelo.Animal;
import Modelo.Empleado;
import Modelo.Especie;
import Modelo.Sector;
import java.util.ArrayList;


public class Datos {
    
    public static ArrayList<Empleado> empleados = new ArrayList<>();    //GUARDA TODOS LOS EMPLEADOS
    public static Empleado empleado;                                    // GUARDA EL EMPLEADO ACTUAL
    public static ArrayList<Animal> animales = new ArrayList<>();       //GUARDA TODOS LOS ANIMALES
    public static Animal animal;                                        //GUARDA EL ANIMAL QUE SE INGRESA
    public static ArrayList<Sector> sectores = new ArrayList<>();       //GUARDA TODOS LOS SECTORES
    public static Sector sector;
    
    
    public static void cargarDatos() {
    
        Empleado emp1 = new Empleado("Luis Martinez", 24128544, "Av Jujuy 1940");
        Empleado emp2 = new Empleado("Jorge Lizondo", 28478135, "Roque correa 2230");
        Empleado emp3 = new Empleado("Marta Sanchez", 21457877, "Av Roca 1754");
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        
        Animal a1 = new Animal("Jabalí", 5, "200 kg", "Argentina");
        Animal a2 = new Animal("León", 3, "250 kg", "Brazil");
        Animal a3 = new Animal ("Llama", 4,"180 kg", "Perú");
        animales.add(a1);
        animales.add(a2);
        animales.add(a3);
        
    
    }
}
