import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de casos de prueba
        int N = scanner.nextInt();

        // Procesar cada caso
        for (int cas = 0; cas < N; cas++) {
            // Leer el número de pilotos
            int K = scanner.nextInt();

            // Crear arrays para almacenar los nombres de los pilotos y las posiciones perdidas
            String[] nomsPilots = new String[K];
            int[] posicionsPerdues = new int[K];

            // Leer los nombres de los pilotos
            for (int i = 0; i < K; i++) {
                nomsPilots[i] = scanner.next();
            }

            // Leer las posiciones que han perdido
            for (int i = 0; i < K; i++) {
                posicionsPerdues[i] = scanner.nextInt();
            }

            // Array para almacenar las nuevas posiciones finales de cada piloto
            int[] posFinals = new int[K];

            // Calcular las posiciones finales basadas en las posiciones perdidas
            for (int i = 0; i < K; i++) {
                posFinals[i] = i - posicionsPerdues[i];  // La nueva posición es la original menos las posiciones perdidas
            }

            // Ordenar los pilotos según sus posiciones finales (menor posición final es mejor)
            for (int i = 0; i < K - 1; i++) {
                for (int j = i + 1; j < K; j++) {
                    if (posFinals[i] > posFinals[j]) {
                        // Intercambiar las posiciones
                        int tempPos = posFinals[i];
                        posFinals[i] = posFinals[j];
                        posFinals[j] = tempPos;

                        // Intercambiar los pilotos correspondientes
                        String tempNom = nomsPilots[i];
                        nomsPilots[i] = nomsPilots[j];
                        nomsPilots[j] = tempNom;
                    }
                }
            }

            // Mostrar las posiciones finales
            System.out.print("[");
            for (int i = 0; i < K; i++) {
                System.out.print(nomsPilots[i]);
                if (i < K - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        scanner.close();
    }
}
