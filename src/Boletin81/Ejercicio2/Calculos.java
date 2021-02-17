package Boletin81.Ejercicio2;

public class Calculos {

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
        System.out.println("La media es "+total/ notas.length);
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



}


