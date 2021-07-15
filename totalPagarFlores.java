package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Una empresa que vende flores sacó una promoción para la última semana de mayo. Si
el cliente compra tres flores, le aplica un descuento del 10 %. El programa recibe la
cantidad de flores y el precio de cada flor. Se debe imprimir el total a pagar.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej10w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 

        int cantidadFlores;
        double precioFlor;
        double porPagar;
        double descuento = 0.1;
        double totalSinDescuento;

        escribir.println("Digite el precio de cada flor:");
        precioFlor = Double.parseDouble(leer.readLine());

        escribir.println("Digite la cantidad de flores compradas");
        cantidadFlores = Integer.parseInt(leer.readLine());

        totalSinDescuento = precioFlor*cantidadFlores;

        if (cantidadFlores>=3){
            porPagar = totalSinDescuento - (totalSinDescuento * descuento);
        } else {
            porPagar = totalSinDescuento;
        }

        escribir.println("El total a pagar es de " +porPagar+ " colones");
    }
}