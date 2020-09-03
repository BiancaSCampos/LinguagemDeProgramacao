package br.uniso;

import java.io.*;

public class ObjectFileReader {

    public static void main (String args[]){

        File f = new File("arquivoObjetos.txt");
        try {
            InputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);
            Student s1 = (Student) ois.readObject();
            Student s2 = (Student) ois.readObject();

            String studentname1 = s1.getNome();
            String studentname2 = s2.getNome();

            System.out.println(studentname1);
            System.out.println(studentname2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
