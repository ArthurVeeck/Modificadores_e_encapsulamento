
package com.mycompany.exercicio07;


public class Aluno extends Pessoa{
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void getIdade() {
        System.out.println("Idade do aluno: " + idade);
    }
}
