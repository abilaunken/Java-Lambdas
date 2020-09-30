package exercitando;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExercicioSolucaoJava8 {

    public static void main(String[] args) {
        List<Pessoa> populacao = Arrays.asList(
                new Pessoa("Joao","Silva", 33),
                new Pessoa("Pedro","Block", 14),
                new Pessoa("Manuel","Cinxa", 54),
                new Pessoa("Enzo","Ziga", 78),
                new Pessoa("Marcelo","Fonseca", 44),
                new Pessoa("Joana","Casulo", 17)
        );

        //Passo 1 : Sort list by ultimo nome
        Collections.sort(populacao, ((p1, p2) -> p1.getUltimoNome().compareTo(p2.getUltimoNome())));

        //Passo 2: Criar um method que printa todos os elementos
        listarComCondicao(populacao, p -> true, p -> System.out.println(p));

        //Passo 3: Criar um method que printa todos os elementos onde o ultimo nome comeca com a Letra C
        listarComCondicao(populacao, p -> p.getUltimoNome().startsWith("C"), p -> System.out.println(p));
    }

    private static void listarComCondicao (List<Pessoa> pessoas, Predicate<Pessoa> predicate, Consumer<Pessoa> consumer){
        for (Pessoa p : pessoas) {
            if(predicate.test(p)){
                consumer.accept(p);
            }

        }
    }
}
