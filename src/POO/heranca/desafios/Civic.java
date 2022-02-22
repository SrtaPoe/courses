package POO.heranca.desafios;

public class Civic extends Carro{
    void acelerar(){
        System.out.println("Velocidade atual | Civic = " + ( velocidadeAtual = velocidadeAtual + 5) + " km");
    }

    void frear(){
        if(velocidadeAtual == 0){
            System.out.println("O carro já está desligado");
        }else{
            System.out.println("Velocidade atual | Civic = " + (velocidadeAtual = velocidadeAtual - 5) + " km");
        }
    }
}
