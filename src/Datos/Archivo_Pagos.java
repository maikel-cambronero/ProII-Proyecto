package Datos;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import Negocio.Pagos;

public class Archivo_Pagos {

   public ArrayList<Pagos> leer() { 

        try { 

            FileReader archivo = new FileReader("pagos.txt"); 
            BufferedReader leer = new BufferedReader(archivo); 
            String linea = ""; 
            String cadena = ""; 
            String[] cadenaSeparada;  

            ArrayList<Pagos> listaPagos = new ArrayList<>(); 
            Pagos pagos = new Pagos(); 
            while ((linea = leer.readLine()) != null) { 
                cadena = linea;  
                cadenaSeparada = cadena.split("/"); 
                
                pagos =  new Pagos (cadenaSeparada [0], // cedula
                                   cadenaSeparada [1], // nmobre estudiante
                                   cadenaSeparada [2], // Mes 
                                   cadenaSeparada [3], // Modo
                                   cadenaSeparada [4], // fecha
                                   cadenaSeparada [5], // grado 
                                   cadenaSeparada [6], // idioma
                                   Integer.parseInt(cadenaSeparada [7]) ); // total 
                listaPagos.add(pagos); 
            }
            leer.close(); 
            archivo.close(); 
            return listaPagos;  

        } catch (IOException ex) { 
            JOptionPane.showMessageDialog(null, "Error"); 
            return null;  
        }
    }

    public void escribir (String nombreArchivo, String datos) { 
        try { 

            FileWriter archivo = new FileWriter(nombreArchivo);
            BufferedWriter informacion = new BufferedWriter(archivo); 
            informacion.write(datos); 
            informacion.close(); 
            archivo.close(); 

        } catch (IOException ex) { 
            JOptionPane.showMessageDialog(null, ex); 
        }
    }
}
