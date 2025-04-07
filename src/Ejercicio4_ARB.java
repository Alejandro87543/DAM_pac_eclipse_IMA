import java.util.*;

public class Ejercicio4_ARB {

    public static void main(String[] args) {
        int NUM_EQUIPOS = 20;

        String[] arrayNombres = new String[NUM_EQUIPOS];
        int[] arrayPuntuacion = new int[NUM_EQUIPOS];

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < NUM_EQUIPOS; i++) {
            System.out.print("Introduce el nombre del equipo " + (i + 1) + ": ");
            arrayNombres[i] = scanner.nextLine();
            arrayPuntuacion[i] = random.nextInt(66) + 35;
        }

        int indiceGanador = 0;
        int indiceUltimo = 0;
        int sumaPuntos = 0;

        for (int i = 0; i < NUM_EQUIPOS; i++) {
            if (arrayPuntuacion[i] > arrayPuntuacion[indiceGanador]) {
                indiceGanador = i;
            }
            if (arrayPuntuacion[i] < arrayPuntuacion[indiceUltimo]) {
                indiceUltimo = i;
            }
            sumaPuntos += arrayPuntuacion[i];
        }

        double mediaPuntos = (double) sumaPuntos / NUM_EQUIPOS;

        System.out.println("Equipo ganador: " + arrayNombres[indiceGanador] + " con " + arrayPuntuacion[indiceGanador] + " puntos.");
        System.out.println("Último clasificado: " + arrayNombres[indiceUltimo] + " con " + arrayPuntuacion[indiceUltimo] + " puntos.");
        System.out.printf("Puntuación media de los equipos: %.2f\n", mediaPuntos);

        scanner.close();
    }
}
