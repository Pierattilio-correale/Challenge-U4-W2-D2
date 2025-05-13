package esercizio2;

import java.util.ArrayList;

public class MetodoEsercizio2 {

    public MetodoEsercizio2() {
    }

    public ArrayList<Integer> listaNumeriRandom(int n) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add((int) Math.floor(Math.random() * 100 + 1));
        }
        return lista;
    }

    public ArrayList<Integer> listaNumero2(ArrayList<Integer> lista) {
        ArrayList<Integer> nuovaLista = new ArrayList<>(lista);

        for (int i = lista.size() - 1; i >= 0; i--) {
            nuovaLista.add(lista.get(i));
        }
        return nuovaLista;
    }

    public void listaNumero3(ArrayList<Integer> lista, boolean n) {
        for (int i = 0; i < lista.size(); i++) {
            int valore = lista.get(i);
            if (n && valore % 2 == 0) {
                System.out.println(valore);
            } else if (!n && valore % 2 != 0) {
                System.out.println(valore);
            }
        }
    }
    public void listaNumero4(ArrayList<Integer> lista, boolean n) {
        for (int i = 0; i < lista.size(); i++) {
            if (n && i % 2 == 0) { // n true → valori in posizioni pari
                System.out.println(lista.get(i));
            } else if (!n && i % 2 != 0) { // n false → valori in posizioni dispari
                System.out.println(lista.get(i));
            }
        }
    }
}