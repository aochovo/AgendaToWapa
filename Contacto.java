/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg001proyectohilos;

/**
 *
 * @author FP Mañana A
 */
public class Contacto {
   private String nombre,sexo,foto, color;
   private Float n_ingles; 

    public Contacto(String nombre, String sexo, String foto, String color, Float n_ingles) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.foto = foto;
        this.color = color;
        this.n_ingles = n_ingles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getN_ingles() {
        return n_ingles;
    }

    public void setN_ingles(Float n_ingles) {
        this.n_ingles = n_ingles;
    }

    
}
