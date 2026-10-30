
import java.util.Scanner;

/**
 * Ejercicio 09: Desarrolle una solución que determine el estado académico de
 * una persona estudiante en una asignatura universitaria a partir de una
 * calificación de evaluación continua, una calificación de examen final y un
 * porcentaje de asistencia. La regla institucional establece que: La asistencia
 * mínima debe alcanzarse para ser evaluado Existe una nota mínima en el examen
 * final, y La nota final se calcula combinando evaluación continua y examen
 * final. La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y
 * mostrar la nota final redondeada a un decimal.
 *
 * @author Daniel Rios
 * @version 1.0
 */
public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaCon, examen, asistencias, notaFi;
        System.out.print("Ingrese nota de evaluacion: ");
        evaCon = tcl.nextDouble();
        System.out.print("Ingrese nota de examen: ");
        examen = tcl.nextDouble();
        System.out.print("Ingrese número de asistencias entre 0 y 100: ");
        asistencias = tcl.nextDouble();
        notaFi = (evaCon + examen) / 2;
        if ((asistencias >= 70 && asistencias <= 100)
                && (evaCon >= 7 && evaCon <= 10) && (examen >= 7 && examen <= 10)
                && (notaFi >= 7 && notaFi <= 10)) {
            System.out.println("Su nota final es: " + notaFi + " Aprobado");
        } else {
            if ((asistencias >= 50 && asistencias <= 70)
                    && (evaCon >= 5 && evaCon <= 7) && (examen >= 5 && examen <= 7)
                    && (notaFi >= 5 && notaFi <= 7)) {
                System.out.println("Su nota final es: " + notaFi + " Supletorio");
            } else {
                System.out.println("Su nota final es: " + notaFi + " Reprobado");
            }
        }
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
