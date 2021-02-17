package Boletin81.Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    private static Scanner teclado = new Scanner(System.in);

    public static void OpcionesMenu() {
        int eleccion;
        System.out.println("Las notas son: ");
        Calculos.meterDatos();
        Calculos.verArray();
        System.out.println("Que eleccion desea hacer?");
        System.out.println("1.Nota media");
        System.out.println("2.Nota mas alta");
        System.out.println("3.Nota mas baja");
        System.out.println("4.Alumnos con nota superior a la media");
        System.out.println("5.Alumnos con nota inferior a la media");
        eleccion = teclado.nextInt();
        switchElecciones(eleccion);
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
