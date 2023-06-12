package net.salesianos.actividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Actividad3 {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File filesito = new File("src/net/salesianos/ficheros/actividadtercera.txt");
            filesito.createNewFile();
            String firma = "Dame veneno que quiero morir" + "\n" + 
            "Dame veneno" + "\n" + 
            "Que antes prefiero la muerte que vivir contigo" + "\n" + 
            "Dame veneno" + "\n" + 
            "Ay, para morir" + "\n" + 
            "Dame veneno que quiero morir" + "\n" + 
            "Dame veneno" + "\n" + 
            "Que antes prefiero la muerte que vivir contigo" + "\n" + 
            "Dame veneno" + "\n" + 
            "Ay, para morir" + "\n" + 
            "Ay, que adelantas con tener" + "\n" + 
            "Ay, los ojos como las moras" + "\n" + 
            "Si cuando sales a la calle" + "\n" + 
            "Que de cualquiera te enamoras" + "\n" + 
            "Que mira si eres presumi'a" + "\n" + 
            "Que mira si eres presumi'a" + "\n" + 
            "Ay, que el traje de los domingos" + "\n" + 
            "Te lo pones to los días" + "\n" + 
            "Dame veneno que quiero morir" + "\n" + 
            "Dame veneno" + "\n" + 
            "Que antes prefiero la muerte que vivir contigo" + "\n" + 
            "Dame veneno" + "\n" + 
            "Ay, para morir" + "\n" + 
            "Dame veneno que quiero morir" + "\n" + 
            "Dame veneno" + "\n" + 
            "Que antes prefiero la muerte que vivir contigo" + "\n" + 
            "Dame veneno" + "\n" + 
            "Ay, para morir" + "\n" + 
            "Ay, levántame la chaqueta" + "\n" + 
            "Y mírame este costa'o" + "\n" + 
            "Ay, verás la puñala'ita" + "\n" + 
            "Que por tu querer me han da'o" + "\n" + 
            "Ay, Virgencita los remedios" + "\n" + 
            "Ay, tiene la cara de pena" + "\n" + 
            "Ay, porque to' los aleluyas" + "\n" + 
            "Que ya no tienen fe en ella" + "\n" + 
            "Dame veneno que quiero morir" + "\n" + 
            "Dame veneno" + "\n" + 
            "Que te prefiero la muerte que vivir contigo" + "\n" + 
            "Dame veneno" + "\n" + 
            "Ay, para morir" + "\n" + 
            "Dame veneno que quiero morir" + "\n" + 
            "Dame veneno" + "\n" + 
            "Que te prefiero la muerte que vivir contigo" + "\n" + 
            "Dame veneno" + "\n" + 
            "Ay, para morir" + "\n" + 
            "Dame veneno que quiero morir" + "\n" + 
            "Dame veneno" + "\n" + 
            "Que te prefiero la muerte que vivir contigo" + "\n" + 
            "Dame veneno";


            FileReader act1 = new FileReader("src/net/salesianos/ficheros/actividad1.txt");
            BufferedReader br1 = new BufferedReader(act1);
            String cadena1 = ("Contenido del fichero 1 : " + br1.readLine() + "\n");
        
            FileReader act2 = new FileReader("src/net/salesianos/ficheros/actividadsegunda.txt");
            BufferedReader br2 = new BufferedReader(act2);
            String cadena2 = ("Contenido del fichero 2 : " + br2.readLine());

            FileWriter writer = new FileWriter(filesito);
            writer.write(cadena1);
            writer.write(cadena2);
            writer.write(firma);

            br1.close();
            br2.close();
            writer.close();



        } catch (Exception e) {
            
        }

        
    }

    



}
