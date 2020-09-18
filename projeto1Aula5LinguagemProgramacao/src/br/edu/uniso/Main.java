package br.edu.uniso;

import java.util.ArrayList;

public class Main {

    public static void main (String args[]){

        //Listas

        ArrayList lista = new ArrayList();
        lista.add("Bianca");
        lista.add(8);
        lista.add(1);
        lista.add(8);
        lista.add(9.5f);


        for (Object i: lista){
            System.out.println(i);
        }

        boolean teste = lista.isEmpty();
        System.out.println(teste);

        int elementos = lista.size();
        System.out.println(elementos);

        System.out.println(lista.get(1));

        lista.remove(2);

        for (Object i: lista){
            System.out.println(i);
        }
    }
}
