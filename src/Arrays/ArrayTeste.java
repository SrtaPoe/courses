package Arrays;

public class ArrayTeste {
    public static void main(String[] args) {
        //1958,1962,1970,1994,2002
        String pentaCampeao = "Títulos da seleção masculina de futebol | Brasil";
        int[] copas = new int[5];
        copas[0] = 1958;
        copas[1] = 1962;
        copas[2] = 1970;
        copas[3] = 1994;
        copas[4] = 2002;

        System.out.println(pentaCampeao);
        //uso do foreach
        for (int copa : copas) {
            System.out.println("O Brasil ganhou na copa de " + copa);
        }
    }
}
