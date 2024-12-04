import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de casos de prueba
        int numCasos = scanner.nextInt();

        // Procesar cada caso
        for (int cas = 0; cas < numCasos; cas++) {
            // Leer el número de episodios de la serie
            int numEpisodis = scanner.nextInt();

            // Inicializar las variables
            boolean haVistFinal = false;
            boolean[] episodisVistos = new boolean[numEpisodis + 1]; // Array para marcar los episodios vistos

            // Leer la secuencia de episodios que ve el millennial
            int episodi;

            // Bucle para leer los episodios
            while (true) {
                episodi = scanner.nextInt(); // Leer el siguiente episodio
                if (episodi == 0) {
                    break; // Final de la secuencia de episodios
                }
                if (episodi >= 1 && episodi <= numEpisodis) {
                    episodisVistos[episodi] = true; // Marcar el episodio como visto
                }
                if (episodi == numEpisodis) {
                    haVistFinal = true; // Verificar si ha visto el último episodio
                }
            }

            // Diagnóstico según los episodios que ha visto
            if (!haVistFinal) {
                System.out.println("ABANDONA");
            } else {
                int episodisPerdutsCount = 0;

                // Contar cuántos episodios ha perdido (no vistos)
                for (int i = 1; i < numEpisodis; i++) {
                    if (!episodisVistos[i]) {
                        episodisPerdutsCount++;
                    }
                }

                // Diagnóstico final según el número de episodios perdidos
                if (episodisPerdutsCount == 0) {
                    System.out.println("ORDENAT");
                } else if (episodisPerdutsCount == 1) {
                    System.out.println("ANSIOS");
                } else {
                    System.out.println("ESTRESSAT");
                }
            }
        }

        scanner.close();
    }
}