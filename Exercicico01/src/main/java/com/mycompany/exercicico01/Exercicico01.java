

package com.mycompany.exercicico01;


public class Exercicico01 {

    public static void main(String[] args) {
        Produto objProduto = new Produto();
        objProduto.setNome("Nescau");
        objProduto.setPreco(10.99);
        System.out.println(objProduto.getNome() + "\n" + "R$"+ objProduto.getPreco());
    }
}
