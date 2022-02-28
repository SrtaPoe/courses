package lambdas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Livro extends Object{

    String titulo;
    double preco;
    double desconto;

    public Livro(String titulo, double preco, double desconto) {
        this.titulo = titulo;
        this.preco = preco;
        this.desconto = desconto;
    }
}
