import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de casos
        int numCasos = scanner.nextInt();
        scanner.nextLine(); // Saltar a la siguiente línea

        for (int i = 0; i < numCasos; i++) {
            // Leer la hora en formato HH:MM
            String hora = scanner.nextLine();

            // Extraer las horas y minutos como caracteres y calcular sus valores
            int horas = (hora.charAt(0) - '0') * 10 + (hora.charAt(1) - '0'); // HH
            int minutos = (hora.charAt(3) - '0') * 10 + (hora.charAt(4) - '0'); // MM

            // Calcular el ángulo de la aguja de las horas
            double anguloHoras = (horas % 12) * 30 + (minutos * 0.5);

            // Calcular el ángulo de la aguja de los minutos
            double anguloMinutos = minutos * 6;

            // Verificar si ambos ángulos son exactamente iguales
            if (anguloHoras == anguloMinutos) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}