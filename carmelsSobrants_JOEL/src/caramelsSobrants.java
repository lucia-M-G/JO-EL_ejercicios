import java.util.Scanner;

public class caramelsSobrants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caramels;
        int nens;
        int sobrant;

        System.out.print("");
        caramels = scanner.nextInt();
        System.out.print("");
        nens = scanner.nextInt();

        sobrant = caramels%nens;

        System.out.println(sobrant);
        scanner.close();
    }
}