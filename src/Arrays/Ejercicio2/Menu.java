package Arrays.Ejercicio2;

import java.util.Scanner;

public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    private static int eleccion=0;
    private static int respuesta=1;

    //Boletin8.1
    public static void OpcionesMenu() {
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
            if(eleccion!=1&&eleccion!=2&&eleccion!=3&&eleccion!=4&&eleccion!=5) {
                System.out.println("Dato no valido");
            }else{
                switch (eleccion){
                    case 1:
                        System.out.println("La nota media es: "+Calculos.notaMedia());
                        break;
                    case 2:
                        System.out.println("La nota mas alta es: "+Calculos.notaMayor());
                        break;
                    case 3:
                        System.out.println("La nota mas baja es: "+Calculos.notaMenor());
                        break;
                    case 4:
                        System.out.println("Numero de notas superiores a la media: "+Calculos.notasSuperioresMedia());
                        break;
                    case 5:
                        System.out.println("Numero de notas inferiores a la media: "+Calculos.notasInferioresMedia());
                        break;
                }
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




    /*
    //Boletin8.2
    public static  void opcionesMenu2(){
        int dni;
        while(respuesta==1) {
            respuesta=0;
            System.out.println("DNI(con letra): ");
            dni = teclado.nextInt();
            
            
            while (respuesta != 1 && respuesta != 2) {
                System.out.println("Desea seguir: ");
                System.out.println("1.Si");
                System.out.println("2.No");
                respuesta = teclado.nextInt();
                if (respuesta != 1 && respuesta != 2) {
                    System.out.println("Dato incorrecto");
                }
            }
        }
    }

    */

}
