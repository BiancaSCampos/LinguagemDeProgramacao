package br.uniso;

import java.io.*;

public class ObjectFileMaker {

    public static void main (String args[]){

        File file = new File("arquivoObjetos.txt");
        try {
            file.createNewFile();

            Student s1 = new Student();
            s1.setCurso("Sistinfo");
            s1.setIdade(20);
            s1.setNome("Bianca");

            Student s2 = new Student();
            s2.setCurso("Sistinfo");
            s2.setIdade(20);
            s2.setNome("Guilherme");

            //fluxo de saída -> OutputStream
            OutputStream os = new FileOutputStream(file);
            //fluxo de saída especial pra gravar projetos
            ObjectOutputStream oos = new ObjectOutputStream(os);

            //quando vou escrever objetos no arquivo, uso writeobject ao invés de write somente
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
