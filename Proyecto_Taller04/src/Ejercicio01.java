import java.util.Scanner;
/**
 * Ejercicio 01: Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario.
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double altura, base, area;
        System.out.print("Ingrese base:");
        base = tcl.nextDouble();
        System.out.print("Ingrese altura:");
        altura = tcl.nextDouble();
        area = (base * altura) / 2;
        System.out.println("Area: " + area);     
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese base:2
Ingrese altura:3
Area: 3.0
BUILD SUCCESSFUL (total time: 5 seconds)
 */