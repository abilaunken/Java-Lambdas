package referencia;

public class ReferenciaDeMetodo {

    public static void main(String[] args) {
        //Thread t = new Thread(() -> printando());

        //Usando referencia de metodo agora
        Thread t = new Thread(ReferenciaDeMetodo::printando);

        t.start();
    }

    public static void printando(){
        System.out.println("Printando alguma coisa");
    }


}
