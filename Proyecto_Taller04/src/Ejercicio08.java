import java.util.Scanner;
/**
 * Ejercicio 08: Se debe generar una solución que permita calcular y mostrar el
 * valor total a pagar mensual de servicios digitales de una persona. Los
 * servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la
 * persona es menor a 30 años se descuenta el 20% del total mensual.
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netf, yotu, drop, spot, toDes, total;
        int edad, descu = 20;
        System.out.println("Ingrese precio de netflix: ");
        netf = tcl.nextDouble();
        System.out.println("Ingrese precio de youtube: ");
        yotu = tcl.nextDouble();
        System.out.println("Ingrese precio de dropbox: ");
        drop = tcl.nextDouble();
        System.out.println("Ingrese precio de spotify: ");
        spot = tcl.nextDouble();
        System.out.println("Ingresar edad: ");
        edad = tcl.nextInt();
        if (edad < 30) {
            toDes = ((netf + yotu + drop + spot) * descu) / 100;
            total = (netf + yotu + drop + spot) - toDes;
            System.out.println("El total a pagar es de: " + total);
        } else {
            total = netf + yotu + drop + spot;
            System.out.println("El total a pagar es:" + total);
        }
    }
}
/**
 * *
 * EVIDENCIA DEL RUN:
 * run:
Ingrese precio de netflix: 
23
Ingrese precio de youtube: 
23
Ingrese precio de dropbox: 
23
Ingrese precio de spotify: 
23
Ingresar edad: 
23
El total a pagar es de: 73.6
BUILD SUCCESSFUL (total time: 8 seconds)
 */