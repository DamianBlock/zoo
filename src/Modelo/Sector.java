package Modelo;

public class Sector {
    
    int numero;
    String coordenada;

    public Sector(int numero, String coordenada) {
        this.numero = numero;
        this.coordenada = coordenada;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }
    
    
    
}
