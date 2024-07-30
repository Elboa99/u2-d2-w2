package esercizio_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// ESERCIZIO 1 //


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci numero intero N per il definire il numero di parole: ");
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> elencoParole = new HashSet<>();

        Set<String> paroleDuplicate = new HashSet<>();


        for (int i = 0; i < n; i++) {

            System.out.println(("Inserisci la parola" + (i + 1) + "parola"));
            String parola = scanner.nextLine();
            if (!elencoParole.add((parola))) {
                paroleDuplicate.add((parola));
            }
            System.out.println(elencoParole);

        }

        System.out.println("elenco parole diverse:" + elencoParole);
        System.out.println("elenco parole uguali:" + paroleDuplicate);
        System.out.println("numero parole diverse:" + elencoParole.size());
    }
}