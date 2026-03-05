

package com.mycompany.exercicio05;


public class Exercicio05 {

    public static void main(String[] args) {
        Funcionario objFuncionario = new Funcionario();

        objFuncionario.setNome("Arthur");
        objFuncionario.setSalario(2500.00);

        System.out.println("Nome: " + objFuncionario.getNome());
        System.out.println("Salário: R$ " + objFuncionario.getSalario());
    }
}
