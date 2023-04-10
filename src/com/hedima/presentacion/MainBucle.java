package com.hedima.presentacion;
import java.util.Scanner;

public class MainBucle {
    public static void main(String[] args) {
/*
        for(int i = 1; i<= 10; i++){
            System.out.println(i+", ");
            System.out.print(i+", ");
        }
*/
        //Solicitar tres números por consola y obtener su suma
/*int suma = 0;
        for (int i = 1; i <= 3; i++) {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Escriba un numero");
            int numero = s1.nextInt();
             suma = suma + s1.nextInt();
            System.out.println(suma);
        }*/
//Mostrar por la consola los números del 100 al 1
  //      for(int i = 100; i>= 1; i--){
  //          System.out.println(i+", ");
  //          System.out.print(i+", ");
  //      }
  /*      System.out.println("Ejercicio 2");
        for (int i=100;i>=1;i--){
            System.out.print(i+ ", ");
        }*/
        //Solicitar un número por la consola y de ese número mostrar su tabla de multiplicación
        Scanner s1 = new Scanner(System.in);
        System.out.println("Escriba un numero");
        int numero = s1.nextInt();
for (int i = 1; i <= 10; i++) {
    System.out.println( numero+" x "+i+" = "+numero*i);



    }

    }
}
