/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielamontes__lab5p2;

/**
 *
 * @author Gabriela Montes
 */
public class Personaje {
    private String nombre, poder, debilidad, universo;
    private int fuerza, afisica, amental, vida;
    private boolean valid, turno,doble;
    
  //click derecho universo listan los del universo  
    //clic drecho personajes, atributos

    public Personaje() {
    }

    public Personaje(String nombre, String poder, String debilidad, String universo, int fuerza, int afisica, int amental, int vida) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.afisica = afisica;
        this.amental = amental;
        this.vida = vida;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAfisica() {
        return afisica;
    }

    public void setAfisica(int afisica) {
        this.afisica = afisica;
    }

    public int getAmental() {
        return amental;
    }

    public void setAmental(int amental) {
        this.amental = amental;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public boolean isDoble() {
        return doble;
    }

    public void setDoble(boolean doble) {
        this.doble = doble;
    }
    
    

    @Override
    public String toString() {
        if (valid) {
            return nombre;
        }
        return this.nombre+"\n Poder-> "+this.poder+"\n Fuerza-> "+this.fuerza+"\n Debilidad-> "+this.debilidad+"\n Agilidad Fisica-> "+this.afisica+"\n Agilidad Mental-> "+this.amental+"\n Puntos de vida-> "+this.vida;
    }
    
    
}
