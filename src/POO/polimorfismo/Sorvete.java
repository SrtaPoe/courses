package POO.polimorfismo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Sorvete extends Comida {

    public Sorvete(double peso, String sabor){
       super(peso, sabor);
    }


}
