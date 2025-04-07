import java.util.Scanner;
public class Ejercicio3_ARB {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Introduce tu nombre: ");
	        String nombre = scanner.nextLine();

	        System.out.print("Introduce tu edad: ");
	        int edad = scanner.nextInt();

	        System.out.print("Introduce tu peso: ");
	        double peso = scanner.nextDouble();

	        System.out.print("Introduce tu altura: ");
	        double altura = scanner.nextDouble();

	        scanner.nextLine();
	        System.out.print("Introduce tu sexo (H/M): ");
	        String sexo = scanner.nextLine();

	        System.out.print("Introduce tu velocidad inicial (km/h): ");
	        double velocidadInicial = scanner.nextDouble();

	        System.out.print("Introduce tu distancia inicial (km): ");
	        double distanciaInicial = scanner.nextDouble();

	        System.out.print("Introduce tus calorías quemadas iniciales: ");
	        double caloriasIniciales = scanner.nextDouble();

	        double imc = peso / (altura * altura);

	        double sumaVelocidad = 0;
	        double sumaDistancia = 0;
	        double sumaCalorias = 0;
	        double maxDistancia = 0;
	        double maxCalorias = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.println("\n--- Sesion " + i + " ---");
	            System.out.print("Velocidad (km/h): ");
	            double velocidad = scanner.nextDouble();
	            sumaVelocidad += velocidad;

	            System.out.print("Distancia (km): ");
	            double distancia = scanner.nextDouble();
	            sumaDistancia += distancia;
	            if (distancia > maxDistancia) maxDistancia = distancia;

	            System.out.print("Calorías quemadas: ");
	            double calorias = scanner.nextDouble();
	            sumaCalorias += calorias;
	            if (calorias > maxCalorias) maxCalorias = calorias;
	        }

	        double mediaVelocidad = sumaVelocidad / 10;
	        double mediaDistancia = sumaDistancia / 10;
	        double mediaCalorias = sumaCalorias / 10;

	        System.out.println(nombre);
	        System.out.println("Edad: " + edad);
	        System.out.println("Peso: " + peso + " kg");
	        System.out.println("Altura: " + altura + " m");
	        System.out.println("Sexo: " + sexo);
	        System.out.printf("Índice de masa corporal" + imc);
	        System.out.println("La media es:");
	        System.out.printf("Velocidad media: " + mediaVelocidad);
	        System.out.printf("Distancia media recorrida: " + mediaDistancia);
	        System.out.printf("Calorías medias quemadas: " + mediaCalorias);
	        System.out.printf("Máxima distancia recorrida: " + maxDistancia);
	        System.out.printf("Máximo número de calorías quemadas en una sesión: " + maxCalorias);

	        System.out.println();
	        boolean mejora = false;
	        if (mediaVelocidad > velocidadInicial) {
	            System.out.println("Has mejorado tu velocidad media.");
	            mejora = true;
	        }
	        if (mediaDistancia > distanciaInicial) {
	            System.out.println("Has mejorado tu distancia media.");
	            mejora = true;
	        }
	        if (mediaCalorias > caloriasIniciales) {
	            System.out.println("Has mejorado tus calorías quemadas medias.");
	            mejora = true;
	        }

	        if (!mejora) {
	            System.out.println("No has mejorado.");
	        }

	        scanner.close();
	    }
	}


