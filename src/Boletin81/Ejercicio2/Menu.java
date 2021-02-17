package Boletin81.Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    private static Scanner teclado = new Scanner(System.in);

    public static void OpcionesMenu() {
        int eleccion=0, respuesta=1;
        System.out.println("Las notas son: ");
        Calculos.meterDatos();
        Calculos.verArray();
        while(eleccion!=1&&eleccion!=2&&eleccion!=3&&eleccion!=4&&eleccion!=5&&respuesta==1) {
            respuesta=0;
            System.out.println("Que eleccion desea hacer?");
            System.out.println("1.Nota media");
            System.out.println("2.Nota mas alta");
            System.out.println("3.Nota mas baja");
            System.out.println("4.Alumnos con nota superior a la media");
            System.out.println("5.Alumnos con nota inferior a la media");
            eleccion = teclado.nextInt();
            switchElecciones(eleccion);
            if(eleccion!=1&&eleccion!=2&&eleccion!=3&&eleccion!=4&&eleccion!=5) {
                System.out.println("Dato no valido");
            }else {
                while (respuesta != 1 && respuesta != 2) {
                    System.out.println("Desea seguir: ");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    respuesta = teclado.nextInt();
                    eleccion=0;
                    if (respuesta != 1 && respuesta != 2) {
                        System.out.println("Dato incorrecto");
                    }
                }
            }
        }
    }

    public static void switchElecciones(int eleccion){
        switch (eleccion){
            case 1:
                Calculos.notaMedia();
                break;
            case 2:
                Calculos.notaMayor();
                break;
            case 3:
                Calculos.notaMenor();
                break;
            case 4:
                Calculos.notasSuperioresMedia();
                break;
            case 5:
                Calculos.notasInferioresMedia();
                break;
        }
    }

}
