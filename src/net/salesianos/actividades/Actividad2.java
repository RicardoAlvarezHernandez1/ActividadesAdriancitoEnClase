package net.salesianos.actividades;

import java.io.BufferedReader;
import java.io.FileReader;

public class Actividad2 {

    public static void main(String[] args) throws Exception {

         
            FileReader fr = new FileReader("src/net/salesianos/ficheros/actividadsegunda.txt");
            BufferedReader bufread = new BufferedReader(fr);
            String cadena = bufread.readLine();
            String textoFichero = "";

            for (int i = 0; i < cadena.length(); i++) {

                textoFichero += cadena.charAt(i) + "_" + (int)cadena.charAt(i) + ",";
            }

            System.out.println(textoFichero.substring(0, textoFichero.length()-1));
            fr.close();

        
    }
}
