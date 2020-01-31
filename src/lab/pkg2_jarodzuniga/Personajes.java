
package lab.pkg2_jarodzuniga;

import java.util.ArrayList;

public class Personajes {
    
private String categoria;
private String nombre;
private String raza;
private double estatura;
private double peso;
private int años;
private String descripcion;
private String nacionalidad;
private int hp;
private int cs;
private int ac;
private int dg;

    public Personajes(String categoria, String nombre, String raza, double estatura, double peso, int años, String descripcion, String nacionalidad, int hp, int cs, int ac, int dg) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.años = años;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.hp = hp;
        this.cs = cs;
        this.ac = ac;
        this.dg = dg;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public int getAños() {
        return años;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    @Override
    public String toString(){
        return "Personale: "+categoria+" nombre: "+nombre+" raza: "+raza+" Estatura: "+ estatura+" Peso:"+ peso+" Edad: "+años+" Descripcion: "+ descripcion+" Nacionalidad: "+nacionalidad+" Hp: "+hp+" Cs: "+cs+" AC: "+ac+" DG: "+dg;
    }
}
