import java.util.Scanner;

public class amanecerUltimoDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segons;
        int moment;
        int dia;

        segons = scanner.nextInt();
        dia = (segons / 86400) + 1;
        moment = (segons % 86400);

        if (moment < 43200) {
            System.out.println("mati del dia " + dia);
        } else if (moment >= 12) {
            System.out.println("nit del dia " + dia);
        }

        scanner.close();
    }
}