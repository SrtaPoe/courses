package POO.heranca.desafios;

public class Ferrari extends Carro{
    void acelerar(){
        System.out.println("Velocidade atual | Ferrari = " + ( velocidadeAtual = velocidadeAtual + 15 ) + " km");
    }

    void frear(){
        if(velocidadeAtual == 0){
            System.out.println("O carro já está desligado");
        }else{
            System.out.println("Velocidade atual | Ferrari = " + (velocidadeAtual = velocidadeAtual - 15) + " km");
        }
    }

}
