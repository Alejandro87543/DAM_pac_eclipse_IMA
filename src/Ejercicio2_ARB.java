import java.util.*;
public class Ejercicio2_ARB {

    public static boolean procesoSeleccion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad > 40) {
            System.out.println("Superas la edad permitida");
            scanner.close();
            return false;
        }

        scanner.nextLine();
        System.out.print("Introduce tu nombre: ");
        scanner.nextLine();

        System.out.print("Introduce tus años trabajados: ");
        scanner.nextInt();

        System.out.print("Introduce tu sueldo anual anterior: ");
        double sueldoBrutoAnterior = scanner.nextDouble();

        if (sueldoBrutoAnterior > 30000) {
            System.out.println("Superas el límite del sueldo permitido");
            scanner.close();
            return false;
        }

        double sumaNominas = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el importe de la nómina " + i + ": ");
            double nomina = scanner.nextDouble();
            sumaNominas += nomina;
        }

        double mediaNominas = sumaNominas / 5;
        double incremento;
        if (mediaNominas > 2500) {
            incremento = mediaNominas * 0.05;
            System.out.printf("Nueva nómina mensual: ", mediaNominas + incremento);
        } else {
            incremento = mediaNominas * 0.10;
            System.out.printf("Nueva nómina mensual: ", mediaNominas + incremento);
        }

        scanner.close();
        return true;
    }

    public static void main(String[] args) {
        procesoSeleccion();
    }
}
