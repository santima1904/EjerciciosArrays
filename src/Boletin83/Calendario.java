/*
Clase para el ejercicio 6 del boletin 8.3
 */
package Boletin83;

public class Calendario {

    /**
     * Metodo para insertr datos en un array y pintarla por pantalla posteriormente
     *
     * Precondiciones: array calendario creada anteriormente
     * Postcondiciones: Se inicializa y se pinta por pantalla el array calendario
     * Entradas: array entera calendario
     * Salidas: Ninguna
     */
    public static void crearArray(int[][] calendario) {
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[0][j] = (int) (Math.floor(Math.random() * (15 - 21 + 1) + 21));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[1][j] = (int) (Math.floor(Math.random() * (15 - 21 + 1) + 21));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[2][j] = (int) (Math.floor(Math.random() * (17 - 23 + 1) + 23));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[3][j] = (int) (Math.floor(Math.random() * (20 - 26 + 1) + 26));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[4][j] = (int) (Math.floor(Math.random() * (24 - 30 + 1) + 30));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[5][j] = (int) (Math.floor(Math.random() * (28 - 34 + 1) + 34));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[6][j] = (int) (Math.floor(Math.random() * (31 - 37 + 1) + 37));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[7][j] = (int) (Math.floor(Math.random() * (31 - 37 + 1) + 37));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[8][j] = (int) (Math.floor(Math.random() * (28 - 34 + 1) + 34));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[9][j] = (int) (Math.floor(Math.random() * (24 - 30 + 1) + 30));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[10][j] = (int) (Math.floor(Math.random() * (18 - 24 + 1) + 24));
        }
        for (int j = 0; j < calendario[0].length; j++) {
            calendario[11][j] = (int) (Math.floor(Math.random() * (16 - 22 + 1) + 21));
        }

        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                System.out.print(calendario[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Metodo para hacer la media de las temperaturas de un mes
     *
     * Precondiciones: array calendario creada anteriormente, mes entero positivo
     * Postcondiciones: Se hace la media de las temperaturas
     * Entradas: array entera calendario, entero mes
     * Salidas: temperatura media
     */
    public static int temperaturaMediaMes(int[][] calendario, int mes) {
        int total = 0;
        for (int j = 0; j < calendario[mes].length; j++) {
            total += calendario[mes][j];
        }
        return total / calendario[mes].length;

    }

    /**
     * Metodo para calcular la temperatura mas alta de un mes
     *
     * Precondiciones: array calendario creada anteriormente, mes entero positivo
     * Postcondiciones: Temperatura mas calurosa
     * Entradas: array entera calendario, entero mes
     * Salidas: temperatura mas alta
     */
    public static int diaMasCalorMes(int[][] calendario, int mes) {
        int calor = 0;
        for (int j = 0; j < calendario[mes].length; j++) {
            if (calor < calendario[mes][j]) {
                calor = calendario[mes][j];
            }
        }
        return calor;
    }

    /**
     * Metodo para calcular la temperatura mas baja de un mes
     *
     * Precondiciones: array calendario creada anteriormente, mes entero positivo
     * Postcondiciones: Temperatura mas baja
     * Entradas: array entera calendario, entero mes
     * Salidas: temperatura mas baja
     */
    public static int diaMasFrioMes(int[][] calendario, int mes) {
        int frio = 40;
        for (int j = 0; j < calendario[mes].length; j++) {
            if (frio > calendario[mes][j]) {
                frio = calendario[mes][j];
            }
        }
        return frio;

    }

    /**
     * Metodo para calcular la temperatura mas baja del anno
     *
     * Precondiciones: array calendario creada anteriormente
     * Postcondiciones: Temperatura mas baja
     * Entradas: array entera calendario
     * Salidas: temperatura mas baja del anno
     */
    public static int diaMasFrioAnno(int[][] calendario){
        int frio = 40;
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j < calendario[i].length; j++) {
                if (frio > calendario[i][j]) {
                    frio = calendario[i][j];
                }
            }
        }
        return frio;
    }
}
