package com.hedima.presentacion;

import java.util.Scanner;

public class MainEstructuraControl {

    public static void main(String[] args) {
    //Estructura if

        int numero =6;
        if (numero == 6) {
            System.out.println("El numero es multiplo de 3");
        }else{
            System.out.println("El número NO es multiplo de 3");}

        //Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
        /*
        1.-Pedir número
        2.-Comprobar que cumple la condición
        3.-En caso de no cumplirla, volver a pedir número
        4.-Pasar el número a String
        5.-Contar carácteres
         */
/*        Scanner s1 = new Scanner(System.in);
        System.out.println("Escriba un numero entre 0 y 9999");
        numero = s1.nextInt();
        if(numero>=0 && numero<=9999){
            int cifras = String.valueOf(numero).length();
            System.out.println("El número tiene "+cifras+" cifras");
        }else {
            System.out.println("Valor inválido");
        }

        System.out.println("Escriba un numero entre 0 y 9999");
        numero = s1.nextInt();
        if(numero>=0 && numero<=9999){
            if(numero<10){
                System.out.println("El número tiene una cifra");
            } else if (numero < 100) {
                System.out.println("El número tiene dos cifra");
            } else if (numero < 1000) {
                System.out.println("El número tiene tres cifra");
            }else{
                System.out.println("El número tiene cuatro cifra");
            }
        }else {
            System.out.println("Valor inválido");
        }
*/
        //Solicitar por la consola un mes y decir por medio de la estructura switch cuantos días se tiene
    /*    Scanner s2 = new Scanner(System.in);
        System.out.println("Ingresa un mes");
        String mes = s2.next();
        switch (mes) {
            case "enero":
                System.out.println("31");
                break;
            case "febrero":
                System.out.println("28");
                break;
            case "marzo":
                System.out.println("31");
                break;
            case "abril":
                System.out.println("30");
                break;
            case "mayo":
                System.out.println("31");
                break;
            case "junio":
                System.out.println("30");
                break;
            case "julio":
                System.out.println("31");
                break;
            case "agosto":
                System.out.println("31");
                break;
            case "septiembre":
                System.out.println("30");
                break;
            case "octubre":
                System.out.println("31");
                break;
            case "noviembre":
                System.out.println("30");
                break;
            case "diciembre":
                System.out.println("31");
                break;
            default:
                System.out.println("Mes no valido");
                break;
        } */

            Scanner s1 = new Scanner(System.in);
            System.out.println("Escriba un numero que represente el mes");
            int mes = s1.nextInt();
            if (mes>=1 && mes<=12){
                switch (mes) {
                    case 2:
                        System.out.println("Tiene 28 dias");
                        break;
                    case 4, 6, 9, 11:
                        System.out.println("Tienen 30 dias");
                        break;
                    default:
                        System.out.println("Tiene 31 días");

                }
            }else{
                System.out.println("mes invvalido");
            }


    }
}
