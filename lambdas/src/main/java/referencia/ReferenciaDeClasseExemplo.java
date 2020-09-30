package referencia;

public class ReferenciaDeClasseExemplo {

    public void doProcess(int i, Process p){
        p.process(i);
    }

    public void execute(){
        doProcess(10, i ->{
            System.out.println("O valor de i é:"+i);
            System.out.println(this);
        });
    }


    public static void main(String[] args) {
        ReferenciaDeClasseExemplo referenciaDeClasseExemplo = new ReferenciaDeClasseExemplo();
        /*referenciaExemplo.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("O valor de i é:"+i);
                System.out.println(this);
            }

            public String toString(){
                return "Retornando toString dentro da inner class anonima";
            }
        });*/

        referenciaDeClasseExemplo.doProcess(10, i ->{
            System.out.println("O valor de i é:" +i);
           // System.out.println(this); //Isso nao vai funcionar, a lambda nao gera instancia, nao eh um objeto
        });

        referenciaDeClasseExemplo.execute();
    }

    public String toString(){
        return "Retornando toString da instancia ReferenciaExemplo";
    }

    interface Process{
        void process(int i);
    }

}
