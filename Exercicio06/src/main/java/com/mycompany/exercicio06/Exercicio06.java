

package com.mycompany.exercicio06;


public class Exercicio06 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("arthur", "1234");

        boolean acesso = usuario.autenticar("arthur", "1234");

        if (acesso) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Login ou senha incorretos.");
        }
        
    }
}
