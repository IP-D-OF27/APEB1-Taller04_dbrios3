
import java.util.Scanner;

/**
 * Ejercicio 10: El programa debe calcular el área del polígono. La figura se 
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. Se 
 * pide que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula 
* multiplicando su base por su altura; el área de un triángulo rectángulo se 
* calcula multiplicando su base por su altura, y luego dividiendo el resultado 
* entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado 
* la medida de uno de sus lados.
 *
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double ladoCu, alturaTri,areaTo;
        System.out.print("Ingrese tamaño del lado del cuadrado: ");
        ladoCu = tcl.nextDouble();
        System.out.print("Ingrese altura del triangulo: ");
        alturaTri = tcl.nextDouble();
        areaTo = (Math.pow(ladoCu, 2)) + (((ladoCu * alturaTri) / 2) * 3) + 
                (ladoCu * alturaTri);
        System.out.println("El area total del poligono es de: " + areaTo + " metros cuadrados");
    }
}
/**
 * *
 * EVIDENCIA DEL RUN: run:
Ingrese nota de evaluacion: 7
Ingrese nota de examen: 4
Ingrese número de asistencias entre 0 y 100: 80
Su nota final es: 5.5 Reprobado
BUILD SUCCESSFUL (total time: 10 seconds)
 */
