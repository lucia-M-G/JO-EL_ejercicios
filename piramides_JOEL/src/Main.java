import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de pirámides y la altura de cada pirámide
        int numPiramides = scanner.nextInt();
        int altura = scanner.nextInt();

        for (int p = 0; p < numPiramides; p++) {
            // Generar cada fila de la pirámide
            for (int i = 0; i < altura; i++) {
                // Espacios iniciales
                for (int j = 0; j < altura - i; j++) {
                    System.out.print("*");
                }

                // Números crecientes hasta el valor máximo de la fila
                for (int j = altura - i; j <= altura; j++) {
                    System.out.print(j);
                }

                // Números decrecientes desde el valor máximo de la fila
                for (int j = altura - 1; j >= altura - i; j--) {
                    System.out.print(j);
                }

                // Espacios finales
                for (int j = 0; j < altura - i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            // Imprimir la base de la pirámide
            for (int i = 0; i <= altura; i++) {
                System.out.print(i);
            }
            for (int i = altura - 1; i >= 0; i--) {
                System.out.print(i);
            }

            System.out.println();
        }

        scanner.close();
    }
}
