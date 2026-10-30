import java.util.Scanner;
/**
 * Ejercicio 06: Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar.
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double monto, interes, monIn, total;
        System.out.println("Ingrese monto del prestamo: ");
        monto = tcl.nextDouble();
        System.out.println("Ingresar interes mensual: ");
        interes = tcl.nextDouble();
        monIn = (monto * interes) / 100;
        total = (monto / 12) + monIn;
        System.out.println("El total a pagar es: "+ total);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese monto del prestamo: 
170
Ingresar interes mensual: 
15
El total a pagar es: 39.666666666666664
BUILD SUCCESSFUL (total time: 5 seconds)
 */