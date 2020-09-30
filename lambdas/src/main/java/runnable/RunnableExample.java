package runnable;

public class RunnableExample {

    public static void main(String[] args) {
     /*   Thread runabble = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printando dentro de uma inner class");
            }
        });
        runabble.run();*/
        Thread runabbleWithLambda = new Thread(() ->  System.out.println("Printando Theread com lambda"));
        runabbleWithLambda.run();
    }
}
