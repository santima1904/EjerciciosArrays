package Arrays.Ejercicio2;

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
    public static int notaMedia(){
        int total=0;

        for(int i=0;i< notas.length;i++){
            total +=notas[i];
        }
        return total/ notas.length;

    }

    public static int notaMayor(){
        int mayor=0;
        for(int i=0;i< notas.length;i++){
           if(notas[i] > mayor)
                mayor = notas[i];
        }
        return mayor;
    }

    public static int notaMenor(){
        int menor=10;
        for(int i=0;i< notas.length;i++){
            if(notas[i] < menor)
                menor = notas[i];
        }
        return menor;
    }

    public static int notasSuperioresMedia(){
        int contador=0;
        for(int i=0;i< notas.length;i++){
            if(notas[i] > notaMedia())
                contador++;
        }
        return contador;
    }

    public static int notasInferioresMedia(){
        int contador=0;
        for(int i=0;i< notas.length;i++){
            if(notas[i] < notaMedia())
                contador++;
        }
        return contador;
    }



}


