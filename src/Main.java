import Arrays.Ejercicio2.Menu;
import Boletin83.Calendario;

public class Main {
    public static void main(String[] args) {

        //Boletin1
       // Menu.OpcionesMenu();


        //Boletin3
        int[][] calendario = new int[12][31];
        Calendario.crearArray(calendario);
        System.out.println("Media: "+Calendario.temperaturaMediaMes(calendario, 0));
        System.out.println(Calendario.diaMasCalorMes(calendario, 2));
        System.out.println(Calendario.diaMasFrioMes(calendario, 2));
        System.out.println(Calendario.diaMasFrioAnno(calendario));
    }
}
