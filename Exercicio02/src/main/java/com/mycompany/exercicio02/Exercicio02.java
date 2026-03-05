/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio02;

/**
 *
 * @author W10
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Produto objProduto = new Produto();
        objProduto.setNome("Nescau");
        objProduto.setPreco(-20.59);
        System.out.println(objProduto.getNome() + "\n" + "R$"+ objProduto.getPreco());
    }
}
