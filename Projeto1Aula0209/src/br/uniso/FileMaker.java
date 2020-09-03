package br.uniso;


import java.io.*;

//neste projeto iremos criar o aquivo ao invés de lê-lo e iremos popula-lo

public class FileMaker {
    public static void main(String args[]){

        String s ="Linguagem de programação";

        File f = new File("arquivoTeste.txt");
        try {
            f.createNewFile();
            OutputStream is= new FileOutputStream(f);
            OutputStreamWriter irs= new OutputStreamWriter(is);
            BufferedWriter br = new BufferedWriter(irs);
            
            //escreve o conteudo no arquivo
            br.write(s);
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
