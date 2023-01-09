package Datos;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Negocio.Matricula; 

public class Archivo_Matricula {

    public ArrayList<Matricula> leer() { 

        try { 

            FileReader archivo = new FileReader("matricula.txt"); 
            BufferedReader leer = new BufferedReader(archivo); 
            String linea = "";  
            String cadena = ""; 
            String[] cadenaSeparada; 

            ArrayList<Matricula> listaMatricula = new ArrayList<>(); 
            Matricula matricula = new Matricula();  
            while ((linea = leer.readLine()) != null) { 
                cadena = linea; 
                cadenaSeparada = cadena.split("/"); 
                matricula = new Matricula (cadenaSeparada[0],
                                           cadenaSeparada[1],
                                           Integer.parseInt(cadenaSeparada[2]),
                                           cadenaSeparada[3],
                                           cadenaSeparada[4],
                                           cadenaSeparada[5],
                                           cadenaSeparada[6],
                                           Integer.parseInt(cadenaSeparada[7]),
                                           cadenaSeparada[8],
                                           Integer.parseInt(cadenaSeparada[9]));
                listaMatricula.add(matricula); 
            }
            leer.close(); 
            archivo.close(); 
            return listaMatricula;  

        } catch (IOException ex) { 
            JOptionPane.showMessageDialog(null, "Error"); 
            return null; 
        }
    }

    public void escribir(String nombreArchivo, String datos) { 
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
