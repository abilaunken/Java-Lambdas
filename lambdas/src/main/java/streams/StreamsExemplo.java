package streams;

import exercitando.Pessoa;

import java.util.Arrays;
import java.util.List;

public class StreamsExemplo {
    public static void main(String[] args) {
        List<Pessoa> populacao = Arrays.asList(
                new Pessoa("Joao","Silva", 33),
                new Pessoa("Pedro","Block", 14),
                new Pessoa("Manuel","Cinxa", 54),
                new Pessoa("Enzo","Ziga", 78),
                new Pessoa("Marcelo","Fonseca", 44),
                new Pessoa("Joana","Casulo", 17)
        );

        populacao.stream()
                .filter(p -> p.getUltimoNome().startsWith("C"))
                .forEach(p -> System.out.println(p.getPrimeiroNome()));

       long qtd = populacao.parallelStream()
                .filter(p -> p.getUltimoNome().startsWith("C"))
                .count();

        System.out.println(qtd);
    }
}
