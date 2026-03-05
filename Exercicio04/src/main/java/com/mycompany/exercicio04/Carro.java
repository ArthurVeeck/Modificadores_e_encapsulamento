
package com.mycompany.exercicio04;


public class Carro extends Veiculo {

    
    public Carro(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public void exibirVelocidadeMaxima() {
        System.out.println("Velocidade máxima do carro: " + velocidadeMaxima + " km/h");
    }
}
