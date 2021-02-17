package Boletin81.Ejercicio2;

public class Calculos {

    private static int media;
    private static int  [] notas = new int[15];

    public static void meterDatos (){
        for (int i=0;i<notas.length;i++){
            notas[i] = (int) Math.floor(Math.random()*(9+1)+1);
        }
    }

    public static void verArray(){
        for(int i=0;i< notas.length;i++){
            System.out.print(notas[i]+" ");
        }
        System.out.println();
    }
    public static void notaMedia(){
        int total=0;

        for(int i=0;i< notas.length;i++){
            total +=notas[i];
        }
        media = total/ notas.length;
        System.out.println("La media es "+media);
    }

    public static void notaMayor(){
        int mayor=0;
        for(int i=0;i< notas.length;i++){
           if(notas[i] > mayor)
                mayor = notas[i];
        }
        System.out.println("La mayor nota es: "+mayor);
    }

    public static void notaMenor(){
        int menor=10;
        for(int i=0;i< notas.length;i++){
            if(notas[i] < menor)
                menor = notas[i];
        }
        System.out.println("La menor nota es: "+menor);
    }

    public static void notasSuperioresMedia(){
        int contador=0;
        for(int i=0;i< notas.length;i++){
            if(notas[i] > media)
                contador++;
        }
        System.out.println("Hay "+contador+" alumnos con notas superiores a la media");
    }

    public static void notasInferioresMedia(){
        int contador=0;
        for(int i=0;i< notas.length;i++){
            if(notas[i] < media)
                contador++;
        }
        System.out.println("Hay "+contador+" alumnos con notas inferiores a la media");
    }



}


