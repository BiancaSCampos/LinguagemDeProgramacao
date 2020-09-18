package br.edu.uniso;


import java.util.HashSet;


public class MainSet {

    public static void main(String args[]){


        // Listas

        HashSet<Aluno> conjunto = new HashSet();

        Aluno a1 = new Aluno();
        a1.setIdade(20);
        a1.setNome("Bianca");
        a1.setRa(98059);

        Aluno a2 = new Aluno();
        a2.setIdade(20);
        a2.setNome("Allan");
        a2.setRa(98569);

        Aluno a3 = new Aluno();
        a3.setIdade(21);
        a3.setNome("Vinicius");
        a3.setRa(65896);

        Aluno a4 = new Aluno();
        a4.setIdade(21);
        a4.setNome("Vinicius");
        a4.setRa(65896);

        conjunto.add(a1);
        conjunto.add(a2);
        conjunto.add(a3);
        conjunto.add(a4);


        for (Aluno i : conjunto){
            System.out.println(i);
        }

    }

}

