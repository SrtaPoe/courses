package POO.heranca.desafios;

public class Carro {

    double velocidadeAtual = 100;

    void acelerar(){
        velocidadeAtual = velocidadeAtual + 5;
    }

    void frear(){
        if(velocidadeAtual == 0){
            System.out.println("O carro já está desligado");
        }else{
            velocidadeAtual = velocidadeAtual - 5;
        }
    }
}
