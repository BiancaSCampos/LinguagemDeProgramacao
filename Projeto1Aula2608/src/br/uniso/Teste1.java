package br.uniso;

import java.io.*;

public class Teste1 {

    public static void main (String args[]){

    //ler o arquivo em java
        File f = new File("alunos.txt");

        try {
            InputStream is = new FileInputStream(f);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            //amador
            /*
            String cabecalho = br.readLine();
            String primeiralinha = br.readLine();
            String segundalinha = br.readLine();

            System.out.println(cabecalho);
            System.out.println(primeiralinha);
            System.out.println(segundalinha);
            */

            //bonitinho

            String linha = br.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
