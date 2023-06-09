package net.salesianos.actividades;

import java.io.BufferedReader;
import java.io.FileReader;

public class Actividad2 {

    public static void main(String[] args) throws Exception {

            int contador = 0;
            
            FileReader fr = new FileReader("src/net/salesianos/ficheros/actividadsegunda.txt");
            BufferedReader bufread = new BufferedReader(fr);
            String cadena = bufread.readLine();
            String textoFichero = "";

            while (contador < cadena.length()) {
                textoFichero += cadena.charAt(contador) + "_" + (int)cadena.charAt(contador) + ",";
                contador++;
            }

            System.out.println(textoFichero);
            fr.close();

        
    }
}
