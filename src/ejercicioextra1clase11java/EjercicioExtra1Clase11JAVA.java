/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.

 */
package ejercicioextra1clase11java;

import java.util.Scanner;

/**
 *
 * @author tata9
 */
public class EjercicioExtra1Clase11JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, num, suma=0;
        Scanner scanner=new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        n = scanner.nextInt();
        int[] vector = new int[n];

                for (int i = 0; i < n; i++) {
                    System.out.println("Ingrese los numeros del vector: ");
            vector[i] = (num=scanner.nextInt());
            suma=(suma + num);
    }
                for (int i = 0; i < n; i++) {
        System.out.print("[" + vector[i] + "]");
                }
                System.out.println(" ");
        System.out.println("La suma de los numeros del Vector es: "+suma);
}
}
