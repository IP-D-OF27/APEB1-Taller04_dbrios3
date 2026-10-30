import java.util.Scanner;
/**
 * Ejercicio 07: Generar un algoritmo que permita calcular y mostrar el valor a
 * cancelar de una planilla de luz. Se debe ingresar el valor de costo por
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
 * tiene edad mayor a 65 años, se debe descontar el 10%.
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costKv, kv, descuento, total;
        int edad;
        System.out.println("Ingrese kilovatios consumidos: ");
        kv = tcl.nextDouble();
        System.out.println("Ingrese precio por kilovatio/hora: ");
        costKv = tcl.nextDouble();
        System.out.println("Ingresar edad: ");
        edad = tcl.nextInt();
        if (edad > 65) {
            descuento = ((kv * costKv) * 10) / 100;
            total = kv * costKv - descuento;
            System.out.println("El total a pagar es de: " + total);
        } else {
            total = kv * costKv;
            System.out.println("El total a pagar es:" + total);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese kilovatios consumidos: 
12
Ingrese precio por kilovatio/hora: 
2
Ingresar edad: 
67
El total a pagar es de: 21.6
BUILD SUCCESSFUL (total time: 10 seconds)
 */