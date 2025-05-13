package esercizio3;

import java.util.Scanner;

public class mainPhoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RubricaTelefonica rubrica = new RubricaTelefonica();

        boolean inizio = true;

        while (inizio) {
            System.out.println("--- MENU RUBRICA ---");
            System.out.println("1. Inserisci persona");
            System.out.println("2. Stampa rubrica");
            System.out.println("3. Cerca nome per numero");
            System.out.println("4. Cerca numero per nome");
            System.out.println("5. Rimuovi persona");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione: ");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci numero di telefono: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    rubrica.inserisciPersona(nome, numero);
                    break;

                case 2:
                    rubrica.stampa();
                    break;

                case 3:
                    System.out.print("Inserisci numero da cercare: ");
                    int numeroDaCercare = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nome trovato: " + rubrica.cercaNome(numeroDaCercare));
                    break;

                case 4:
                    System.out.print("Inserisci nome da cercare: ");
                    String nomeDaCercare = scanner.nextLine();
                    System.out.println("Numero trovato: " + rubrica.cercaNumero(nomeDaCercare));
                    break;

                case 5:
                    System.out.print("Inserisci nome da rimuovere: ");
                    String nomeDaRimuovere = scanner.nextLine();
                    rubrica.rimuoviPersona(nomeDaRimuovere);
                    break;

                case 6:
                   inizio = false;
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }


    }
}
