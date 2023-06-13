package net.salesianos.actividades;

import java.io.Console;
import java.util.Scanner;

import net.salesianos.actividades.clases.Metodos;

public class Actividad4 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        boolean salida = false;
        Console c = System.console();

        while (!salida) {
            System.out.println("Introduzca cosas en el menu :");
            System.out.println("1. Nueva Mesa ");
            System.out.println("2. Mostrar Mesas");
            int opcion = teclado.nextInt();

            teclado.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.println("Color:");
                    String color = teclado.nextLine();
                    System.out.println("Numero de patas:");
                    int numPatas = teclado.nextInt();

                    Metodos.guardarMesa(color , numPatas);
                    break;
                case 2:
                    Metodos.mostrarMesas();
                    break;

                case 3:
                    salida = true;
                    break;
                default:
                    break;
            }
        }
    }
    
    

    
}
