

package com.mycompany.exercicio10;


public class Exercicio10 {

    public static void main(String[] args) {
        Carro ObjCarro = new Carro();

        ObjCarro.setMarca("Fiat");
        ObjCarro.setModelo("Tempra");
        ObjCarro.setAno(1996);

        System.out.println("Marca: " + ObjCarro.getMarca());
        System.out.println("Modelo: " + ObjCarro.getModelo());
        System.out.println("Ano: " + ObjCarro.getAno());

    }
}
