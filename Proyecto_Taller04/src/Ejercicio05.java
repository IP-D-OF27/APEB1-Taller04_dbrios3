import java.util.Scanner;

/**
 * Ejercicio 04: Generar un algoritmo que permita calcular y mostrar el costos 
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón.
 *
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double cpu, tecla, pan, rat, resul;
        System.out.println("Costo de CPU: ");
        cpu = tcl.nextDouble();
        System.out.println("Costo de teclado: ");
        tecla = tcl.nextDouble();
        System.out.println("Costo de pantalla: ");
        pan = tcl.nextDouble();
        System.out.println("Costo de raton: ");
        rat = tcl.nextDouble();
        resul = cpu + tecla + pan + rat;
        System.out.println("El total es: "+ resul);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Costo de CPU: 
23
Costo de teclado: 
34
Costo de pantalla: 
23
Costo de raton: 
34
El total es: 114.0
BUILD SUCCESSFUL (total time: 8 seconds)
 */