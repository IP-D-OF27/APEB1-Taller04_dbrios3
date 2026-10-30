import java.util.Scanner;
/**
 * Ejercicio 03: Se desea desarrollar un algoritmo que permita mostrar la tabla
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos.
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un numero entre el 2 y 6:");
        num = tcl.nextInt();
        if (num >= 2 && num <= 6) {
            System.out.println(num + " * 1 = " + num * 1);
            System.out.println(num + " * 2 = " + num * 2);
            System.out.println(num + " * 3 = " + num * 3);
            System.out.println(num + " * 4 = " + num * 4);
            System.out.println(num + " * 5 = " + num * 5);
            System.out.println(num + " * 6 = " + num * 6);
            System.out.println(num + " * 7 = " + num * 7);
            System.out.println(num + " * 8 = " + num * 8);
            System.out.println(num + " * 9 = " + num * 9);
            System.out.println(num + " * 10 = " + num * 10);
            System.out.println(num + " * 11 = " + num * 11);
            System.out.println(num + " * 12 = " + num * 12);
        } else {
            System.out.println("Número invalido");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un numero entre el 2 y 6:3
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
3 * 4 = 12
3 * 5 = 15
3 * 6 = 18
3 * 7 = 21
3 * 8 = 24
3 * 9 = 27
3 * 10 = 30
3 * 11 = 33
3 * 12 = 36
BUILD SUCCESSFUL (total time: 2 seconds)
 */