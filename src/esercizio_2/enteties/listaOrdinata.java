package esercizio_2.enteties;

import esercizio_2.ListaOrdinata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaOrdinata implements ListaOrdinata {

    Scanner scanner = new Scanner(System.in);


    @Override
    public void listaOrdinata() {
        System.out.println(("Inserire in numero N: "));
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numeri = new ArrayList<>();
        int numeroCasuale = (int) Math.random();
        for (int i = 0; i < n; i++) {
            numeri.add(numeroCasuale);
        }

    }
}
