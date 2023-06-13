package net.salesianos.actividades.clases;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Metodos {

    static int contador = 0;
    static Mesa[] arrMesas = new Mesa[contador];

    public static void guardarMesa(String color, int numPatas) {
        Mesa mesita = new Mesa(color, numPatas);

        arrMesas[contador] = mesita;
        try {
            FileOutputStream outputFile = new FileOutputStream("src/net/salesianos/ficheros/actividadcuarta.txt");

            BufferedOutputStream bufferedOutput = new BufferedOutputStream(outputFile);

            ObjectOutputStream objectOutput = new ObjectOutputStream(bufferedOutput);

            objectOutput.writeObject(arrMesas);

            objectOutput.close();
        } catch (IOException e) {
            System.out.println("hola pa ti mi cola");
        }

        contador++;
    }

    public static void mostrarMesas() {
       

        try {
            
            FileInputStream inputFile = new FileInputStream("src/net/salesianos/ficheros/actividadcuarta.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(inputFile);
            ObjectInputStream objectInput = new ObjectInputStream(bufferedInput);
            
            Mesa arr = (Mesa) objectInput.readObject();
            while (true) {
                System.out.println(arr);
                arr = (Mesa) objectInput.readObject();
            }
         
        } catch (IOException e) {
            System.out.println("Hemos llegado al final del fichero.");
        } catch (ClassNotFoundException c){
            System.out.println("Jaaaaajajajajajaja soy ronaldinio");
        }
    }
}