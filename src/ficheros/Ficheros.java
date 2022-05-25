/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Bsanc
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        //declara fichero
        File fichero = new File("FichTexto.txt");
        //crear el flujo de salida
        FileWriter fic = new FileWriter(fichero, true);
        String cadena = "Esto es una prueba con FileWriter escribiendo uno a uno";

        //convierte un String en array de caracteres
        char[] cad = cadena.toCharArray();
        //se va escribiendo un caracter
//        for (int i = 0; i < cad.length; i++) {
//            fic.write(cad[i]);
//        }

        fic.write(cad);

        //añado al final un *
        fic.append('*');
        //añado al final un salto de linea
        fic.append('\n');

        //cerrar fichero
        fic.close();

        System.out.println("El proceso ha finalizado.");

        File fichero2 = new File("FichProvincias.txt");
        //crear el flujo de salida
        fic = new FileWriter(fichero2, true);

        String prov[] = {"Albacete", "Avila", "Badajoz", "Caceres", "Huelva", "Jaen",
            "Madrid", "Segovia", "Soria", "Toledo", "Valladolid", "Zamora"};

//se ha a?adido el salto de linea
        for (int i = 0; i < prov.length; i++) {
            fic.write(prov[i] + "\n");
        }
        //cerrar fichero
        fic.close();

        System.out.println("El proceso ha finalizado.");
    }

}
