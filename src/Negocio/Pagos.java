
package Negocio;

import Datos.Archivo_Pagos;
import java.util.ArrayList;

public class Pagos {
    static final int costoMatricula = 1575000;
    static final int costoIdiomas = 648000;
    
  String cedula;
  String nombreEstu;
  String mes;
  String modo;
  String fecha;
  String idioma;
  String grado;
  int total;
  
    int pagoMatricula;
    int pagoAleman;
    int pagoMandarin;

    public Pagos() {
    }

    public Pagos(int pagoMatricula, int pagoAleman, int pagoMandarin) {
        this.pagoMatricula = pagoMatricula;
        this.pagoAleman = pagoAleman;
        this.pagoMandarin = pagoMandarin;
    }
    
    public Pagos(String cedula, String nombreEstu, String mes, String modo, String fecha, String idioma, String grado, int total) {
        this.cedula = cedula;
        this.nombreEstu = nombreEstu;
        this.mes = mes;
        this.modo = modo;
        this.fecha = fecha;
        this.idioma = idioma;
        this.grado = grado;
        this.total = total;
    }

    public int getPagoMatricula() {
        return pagoMatricula;
    }

    public void setPagoMatricula(int pagoMatricula) {
        this.pagoMatricula = pagoMatricula;
    }

    public int getPagoAleman() {
        return pagoAleman;
    }

    public void setPagoAleman(int pagoAleman) {
        this.pagoAleman = pagoAleman;
    }

    public int getPagoMandarin() {
        return pagoMandarin;
    }

    public void setPagoMandarin(int pagoMandarin) {
        this.pagoMandarin = pagoMandarin;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreEstu() {
        return nombreEstu;
    }

    public void setNombreEstu(String nombreEstu) {
        this.nombreEstu = nombreEstu;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pagos{" + "cedula=" + cedula +
                          ", nombreEstu=" + nombreEstu +
                          ", mes=" + mes + 
                          ",modo=" + modo + 
                          ", fecha=" + fecha + 
                          ", idioma=" + idioma + 
                          ", grado=" + grado + 
                          ", total=" + total + '}';
    }
  
    public int pendienteMatricula() {
        int pendiente = 0;
        int mensual = costoMatricula/12;
        int mesesRestantes = 12-getPagoMatricula();
        pendiente = mensual*mesesRestantes;
        return pendiente;
    }
    
    public int pendienteMandarin(){
        int pendiente = 0;
        int mensual = costoIdiomas/12;
        int mesesRestantes = 12-getPagoMandarin();
        pendiente = mensual*mesesRestantes;
        return pendiente;
    }
    
    public int pendienteAleman(){
        int pendiente = 0;
        int mensual = costoIdiomas/12;
        int mesesRestantes = 12-getPagoAleman();
        pendiente = mensual*mesesRestantes;
        return pendiente;
    }
    
  public void guardarArchivo (String informacion){ 
       Archivo_Pagos archivoPagos = new Archivo_Pagos(); 
       archivoPagos.escribir("pagos.txt", informacion); 
    }
    
    public ArrayList<Pagos> leerArchivo () { 
        Archivo_Pagos archivoPago = new Archivo_Pagos();  
        return archivoPago.leer(); 
    }
    
}
