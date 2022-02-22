package POO.polimorfismo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pessoa {
    private double peso;
    private String sabor;

    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

    public Pessoa(double peso, String sabor){
        setPeso(peso);
        setSabor(sabor);
    }

    public void setPeso(double peso){
        if(peso >= 0){
            this.peso = peso;
        }
    }
}
