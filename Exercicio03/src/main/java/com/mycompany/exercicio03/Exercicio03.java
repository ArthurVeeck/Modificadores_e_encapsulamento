

package com.mycompany.exercicio03;


public class Exercicio03 {

    public static void main(String[] args) {
        ContaBancaria objConta = new ContaBancaria();
        objConta.titular = "Arthur";
        objConta.setSaldo(1000);
        objConta.depositar(400);
        objConta.sacar(1200);
        
        System.out.println("Saldo atual: " + objConta.getSaldo());
    }
}
