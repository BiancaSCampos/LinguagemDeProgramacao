package br.uniso;

import java.io.Serializable;

//algo serializavel é algo que pode ser salvado em disco
public class Student implements Serializable {

   private String nome;
   private int idade;
   private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
