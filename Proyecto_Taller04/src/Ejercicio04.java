import java.util.Scanner;

/**
 * Ejercicio 04: Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos
 * , el número de minutos consumidos en el mes.
 *
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double min, cosMi, resul;
        System.out.print("Ingrese minutos:");
        min = tcl.nextDouble();
        System.out.print("Ingrese costo por minuto:");
        cosMi = tcl.nextDouble();
        resul = min * cosMi;
        System.out.println("El total a pagar es: " + resul);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese minutos:12
Ingrese costo por minuto:34
El total a pagar es: 408.0
BUILD SUCCESSFUL (total time: 7 seconds)
 */