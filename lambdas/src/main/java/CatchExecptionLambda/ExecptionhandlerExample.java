package CatchExecptionLambda;

import java.util.function.BiConsumer;

public class ExecptionhandlerExample {

    public static void main(String[] args) {
        int [] numeros = {2, 4, 6, 8};
        int key = 0;

        fazAlgumaCoisa(numeros, key, wrapperLambdaException((v , k) -> System.out.println(v / k)));
    }

    private static void fazAlgumaCoisa (int[] numeros, int key, BiConsumer<Integer, Integer> consumer){
        for (int n: numeros) {
            consumer.accept(n, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambdaException(BiConsumer<Integer, Integer> consumer){
            return (v , k) -> {
                System.out.println("Executando atravez de um wrapper");
                try {
                    consumer.accept(v, k);
                }catch (ArithmeticException a){
                    System.out.println("Erro Aritmetico");
                }
            };
    }
}
