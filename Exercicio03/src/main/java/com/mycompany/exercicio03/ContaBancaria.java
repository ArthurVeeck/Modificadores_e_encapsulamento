
package com.mycompany.exercicio03;


public class ContaBancaria {
    public String titular;
    private double saldo;
    
    public String getTitular (){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
