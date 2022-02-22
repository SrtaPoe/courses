package POO.polimorfismo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Feijao extends Comida{

    public Feijao(double peso, String sabor){
        super(peso, sabor);
    }

}
