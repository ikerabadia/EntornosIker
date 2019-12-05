/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quijoteiker;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Vespertino
 */
public class QuijoteIker {
    
    static Scanner teclado = new Scanner(System.in,"ISO-8859-1");    

    public static void main(String[] args) {
        int apariciones = 0;
        String palabra;
        palabra = palabra();
        String fichero = "Pedro hola Hola holas ahola Garcia";   //variable con el fichero

        //metodo
        apariciones = cuentaPalabras(palabra, fichero);
        System.out.println("El numero de veces que aparece la palabra introducida es de: " + apariciones);
    }

    public static int cuentaPalabras(String palabra, String fichero) {
        int apariciones = 0;

        StringTokenizer tokens = new StringTokenizer(fichero, "[\\s\\.,\n]");
        while(tokens.hasMoreTokens()){
            if (true) {
                
            }
            System.out.println(tokens.nextToken());
        }
        return apariciones;
    }
    
    public static String palabra(){
        String cadena;
        
        cadena = teclado.next();
        while (!cadena.matches("[A-Za-záÁéÉíÍóÓúÚñÑ]*")){
            System.out.println("Por favor que no tenga ni simbolos ni numeros.");
            cadena = teclado.next();
        }
        return cadena;        
    }
    
}
