package POO.desafios;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        //somente usado dentro de um construtor
       this(31,12,1991);
    }

    Data(int dia, int mes, int ano){
       this.dia = dia;
       this.mes = mes;
       this.ano = ano;
    }


    String obterDataFormada(){
        return (dia + "/" + mes + "/" + ano);
    }
}
