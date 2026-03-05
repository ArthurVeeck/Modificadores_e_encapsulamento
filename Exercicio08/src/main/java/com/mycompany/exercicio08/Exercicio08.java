

package com.mycompany.exercicio08;


public class Exercicio08 {

    public static void main(String[] args) {
        Porta objPorta = new Porta();

        objPorta.abrir();
        System.out.println("Porta aberta? " + objPorta.getAberta());

        objPorta.fechar();
        System.out.println("Porta aberta? " + objPorta.getAberta());

    }
}
