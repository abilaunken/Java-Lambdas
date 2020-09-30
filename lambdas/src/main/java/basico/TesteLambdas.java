package basico;

public class TesteLambdas {

    public static void saudar(Saudacao saudacao){
        saudacao.perform();
    }

    public static void main(String[] args){
        SaudacaoImpl sauImpl = new SaudacaoImpl();
        saudar(sauImpl);

        Saudacao saudarlambda = () -> System.out.println("Saudacao lambda");
        saudar(saudarlambda);

    }


}
