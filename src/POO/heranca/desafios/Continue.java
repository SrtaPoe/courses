package POO.heranca.desafios;

public class Continue {
    public static void main(String[] args) {

        int numeroEntrada = 9;

        for(int i = 1; i<=10;i++){
            int mult = numeroEntrada * i;
            String resultado = numeroEntrada + " x " + i + " = " + mult;
            if(mult % 2 == 0){
              continue;
          }
            System.out.println(resultado);
        }
    }
}
