import java.util.Scanner;

public class barretHogwarts {
    public static void main(String[] args) {
        String respostaUsuari;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Què és el més important per a tu? ");
        respostaUsuari = scanner.nextLine();

        if (respostaUsuari.equals ("Coratge")) {
            System.out.println("Gryffindor");
        } else if (respostaUsuari.equals ("Coneixement")) {
            System.out.println("Ravenclaw");
        } else if (respostaUsuari.equals  ("Ambicio")) {
            System.out.println("Slytherin");
        } else {
            System.out.println("Hufflepuff");
        }

        scanner.close();
    }
}