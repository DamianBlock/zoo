package Modelo;

public class Animal {
    int edad;
    String peso;
    String pais;
    String especie;
    
      public Animal(int edad, String peso, String pais, String especie) {
        this.edad = edad;
        this.peso = peso;
        this.pais = pais;
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
      
       public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
