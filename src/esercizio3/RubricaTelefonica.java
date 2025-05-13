package esercizio3;

import java.util.HashMap;
import java.util.Set;

public class RubricaTelefonica {
    private HashMap<String , Integer>rubrica;

    public RubricaTelefonica() {
        rubrica= new HashMap<>();
    }
    public void inserisciPersona(String nome , int numero){
       rubrica.put(nome , numero);
    }
    public void rimuoviPersona(String nome ){
        rubrica.remove(nome);
    }
    public String cercaNome(int numero){


        Set<String> chiavi=rubrica.keySet();


        for(String nome: chiavi){
            if(rubrica.get(nome)==numero){
                return nome;
            }
        }
        return null;
    }
    public Integer cercaNumero(String nome) {
        return rubrica.get(nome);
    }
public void stampa(){
    System.out.println(rubrica);
}
}
