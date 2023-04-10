package com.hedima.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Variable primitivas
        float precio = 10.5f;
        System.out.println("Mi variable float tiene el valor de: " + precio);
        //Hay que declarar una variable char con el nombre que quieran y su valor va ser z
        char estado='z';
        System.out.println("Mi variable char tiene el valor de: " + estado);
        // Definir una variable de tipo long, con el valor 123.456,81
        long val=12345681l;
        System.out.println("Mi variable long tiene el valor de: " + val);
        // Definir una variable float con el valor de 34.005,87
        float valor2=34005.87f;
        System.out.println("Mi variable float tiene el valor de: " + valor2);

        //Variables de referencia
        //Declarar una variable de tipo String con el valor hoy es lunes de pascua
        String frase = "hoy es lunes de pascua";
        System.out.println("Mi variable String tiene el valor de: " + frase.toUpperCase());
        //Extraer de la variable hoy la palabra lunes
        System.out.println("Mi variable String tiene el valor de: " + frase.lastIndexOf("lunes"));
        System.out.println("Mi variable String tiene el valor de: " + frase.lastIndexOf("lunes"));
        System.out.println("("+frase.substring(frase.indexOf("lunes"),frase.indexOf("lunes")+"lunes".length())+")");
        System.out.println("Mi variable String tiene el valor de: " + frase.substring(7,12));

        //Scanner
        Scanner s1 = new Scanner(System.in);
        System.out.println("Escriba su edad -> ");
        int edad = s1.nextInt();

        System.out.println("Escriba su profesión -> ");
        String profesion = s1.next();
        System.out.println("Su profesion es: " + profesion);

        //Variables de referencia para fechas
        LocalDate fNacimiento = LocalDate.of(1992, 8,30);
        System.out.println("Fecha de nacimiento " + fNacimiento);
        System.out.println(fNacimiento.plusYears(1));
        System.out.println("Su edad es -> " + Period.between(fNacimiento,LocalDate.now())+")");



    }
}