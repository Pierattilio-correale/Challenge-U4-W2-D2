package esercizio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
MetodoEsercizio2 metodo = new MetodoEsercizio2();
        System.out.println("inserisci un numero da 1 a 100");
int numeroRandom= scanner.nextInt();
        ArrayList<Integer> lista = metodo.listaNumeriRandom(numeroRandom);

        System.out.println(lista);

        //esercizio 2
        System.out.println(metodo.listaNumero2(lista));

        //esercizio 3
        System.out.println("inserisci true per stampare numeri pari false per numeri dispari");
         boolean boleano= scanner.nextBoolean();

        metodo.listaNumero3(lista, boleano);


    }
}
