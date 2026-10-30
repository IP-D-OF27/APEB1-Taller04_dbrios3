import java.util.Scanner;
/**
 * Ejercicio 02: Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los hijos del padre de familia.
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double gast1, gast2, gast3, total;
        System.out.print("Ingresar gasto hijo 1:");
        gast1 = tcl.nextDouble();
        System.out.print("Ingresar gasto hijo 2:");
        gast2 = tcl.nextDouble();
        System.out.print("Ingresar gasto hijo 3:");
        gast3 = tcl.nextDouble();
        total = gast1 + gast2 + gast3;
        System.out.println("El total de gastos es: " + total);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingresar gasto hijo 1:20
Ingresar gasto hijo 2:45
Ingresar gasto hijo 3:34
El total de gastos es: 99.0
BUILD SUCCESSFUL (total time: 8 seconds)
 */