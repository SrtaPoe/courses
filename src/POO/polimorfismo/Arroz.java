package POO.polimorfismo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Arroz extends Comida {

    public Arroz(double peso, String sabor) {
        super(peso, sabor);
    }

}
