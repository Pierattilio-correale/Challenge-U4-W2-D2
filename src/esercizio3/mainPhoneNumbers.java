package esercizio3;

public class mainPhoneNumbers {
    public static void main(String[] args) {
RubricaTelefonica provaRubrica = new RubricaTelefonica();

provaRubrica.inserisciPersona("Pierattilio", 3884442);
provaRubrica.inserisciPersona("Jessica", 38844345);
provaRubrica.inserisciPersona("Matteo", 345876442);
provaRubrica.inserisciPersona("Luca", 3645342);
        provaRubrica.stampa();


        System.out.println(provaRubrica.cercaNome(3645342));
        System.out.println(provaRubrica.cercaNumero("Luca"));
       provaRubrica.rimuoviPersona("Matteo");
        provaRubrica.stampa();


    }
}
