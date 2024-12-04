import java.util.Scanner;

public class paAmbTomaquet {
    public static void main(String[] args) {
        String primeraparaula;
        String segonaparaula;

        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        primeraparaula = scanner.nextLine();
        System.out.print("");
        segonaparaula = scanner.nextLine();

        System.out.println(primeraparaula + " amb " + segonaparaula);
        scanner.close();
    }
}