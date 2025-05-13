package esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> paroleDiverse = new HashSet<>();
        ArrayList<String> paroleDuplicate = new ArrayList<>();

        System.out.println("Inserisci un numero n:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numero; i++) {
            System.out.println("Inserisci la parola:");
            String parola = scanner.nextLine();

            if (!paroleDiverse.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero parole distinte: " + paroleDiverse.size());
        System.out.println("Parole distinte: " + paroleDiverse);
    }
}
