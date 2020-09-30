package referencia;

import exercitando.Pessoa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ReferenciaDeMetodo2 {

    public static void main(String[] args) {

        List<Pessoa> populacao = Arrays.asList(
                new Pessoa("Joao", "Silva", 33),
                new Pessoa("Pedro", "Block", 14),
                new Pessoa("Manuel", "Cinxa", 54),
                new Pessoa("Enzo", "Ziga", 78),
                new Pessoa("Marcelo", "Fonseca", 44),
                new Pessoa("Joana", "Casulo", 17)
        );



        //listarComCondicao(populacao, p -> true, p -> System.out.println(p));

        // Agora com referencia de método
        listarComCondicao(populacao, p -> true, System.out::println);

    }

    private static void listarComCondicao (List<Pessoa> pessoas, Predicate<Pessoa> predicate, Consumer<Pessoa> consumer){
        for (Pessoa p : pessoas) {
            if(predicate.test(p)){
                consumer.accept(p);
            }

        }
    }

}
