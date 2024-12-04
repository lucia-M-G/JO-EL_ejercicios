import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        int inicio = input.nextInt();
        for (int i = inicio; i >= 0; i --){
            System.out.println(i);
        }
    }
}