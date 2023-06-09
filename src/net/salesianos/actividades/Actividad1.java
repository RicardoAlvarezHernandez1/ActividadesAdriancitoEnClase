package net.salesianos.actividades;
import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;

public class Actividad1{

    public static void main(String[] args) throws Exception {
        Console c = System.console();
        boolean salida = false; 
        String cadenaFormateada = "";

        String cadena = c.readLine("Introduzca una cadena de menos de 30 caracteres : ");
        
        while (!salida) {
            if (cadena.length() < 30) {
                System.out.println("A su cadena le faltan " + (30-cadena.length()) + " caracteres.");
                cadena = c.readLine("Vuelva a introducir la cadena pero con 30 caracteres (persona complicada ;) ) : ");

            } else{
                cadenaFormateada += cadena.toUpperCase().replace(" ", "_");
                salida = true;
            }
        }

        try {
            FileWriter writer = new FileWriter("src/net/salesianos/ficheros/actividad1.txt");
            writer.write(cadenaFormateada);
            writer.close();
        }catch (IOException e){
            System.out.println("Joder ni escribir una cadena sabes");
        }

        
    }
}