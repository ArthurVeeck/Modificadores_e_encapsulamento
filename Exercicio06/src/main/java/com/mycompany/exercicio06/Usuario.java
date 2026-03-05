
package com.mycompany.exercicio06;


public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean autenticar(String login, String senha) {
        if (this.login.equals(login) && this.senha.equals(senha)) {
            return true;
        }
        return false;
    }
}
