// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj dlugosc boku przyprostokatnych n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Podaj znak z jakiego ma byc zrobiony trojkat");
        char znak = scanner.next().charAt(0);
        scanner.close();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(znak + " ");
                }
            } else {
                System.out.print(znak + " ");
                for (int j = 1; j < n-1; j++) {
                    System.out.print("  ");
                }
                System.out.print(znak + " ");
            }
            System.out.println();
        }
    }
}