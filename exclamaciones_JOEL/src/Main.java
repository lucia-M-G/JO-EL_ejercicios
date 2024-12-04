import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String entrada = scanner.nextLine();

            if (entrada.length() == 3 &&
                    entrada.charAt(0) == 'F' &&
                    entrada.charAt(1) == 'I' &&
                    entrada.charAt(2) == 'N') {
                break;
            }

            int abrir = 0;
            int cerrar = 0;

            for (int i = 0; i < entrada.length(); i++) {
                if (entrada.charAt(i) == '¡') {
                    abrir++;
                } else if (entrada.charAt(i) == '!') {
                    cerrar++;
                }
            }

            if (abrir == cerrar) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}