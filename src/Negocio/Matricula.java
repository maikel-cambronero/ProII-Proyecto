
package Negocio;

import java.util.ArrayList;
import Datos.Archivo_Matricula;


public class Matricula {
    String cedula;
    String nombreEstudiante;
    int edad;
    String genero;
    String grado;
    String idiomas;
    String nombreEncargado;
    int telefono;
    String direccion;
    int año;

    public Matricula() {
    }

    public Matricula(String cedula, String nombreEstudiante, int edad, String genero, String grado, String idiomas, String nombreEncargado, int telefono, String direccion, int año) {
        this.cedula = cedula;
        this.nombreEstudiante = nombreEstudiante;
        this.edad = edad;
        this.genero = genero;
        this.grado = grado;
        this.idiomas = idiomas;
        this.nombreEncargado = nombreEncargado;
        this.telefono = telefono;
        this.direccion = direccion;
        this.año = año;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Matricula{" + "cedula=" + cedula + 
                ", nombreEstudiante=" + nombreEstudiante + 
                ", edad=" + edad + 
                ", genero=" + genero + 
                ", grado=" + grado + 
                ", idiomas=" + idiomas + 
                ", nombreEncargado=" + nombreEncargado + 
                ", telefono=" + telefono + 
                ", direccion=" + direccion + 
                ", año=" + año 
                + '}';
    }
    
     public void guardarArchivo (String informacion){ 
       Archivo_Matricula archivoMatricula = new Archivo_Matricula(); 
       archivoMatricula.escribir("matricula.txt", informacion); 
    }
    
    public ArrayList<Matricula> leerArchivo () { 
        Archivo_Matricula archivoMatricula = new Archivo_Matricula();  
        return archivoMatricula.leer(); 
    }
    
    
}
