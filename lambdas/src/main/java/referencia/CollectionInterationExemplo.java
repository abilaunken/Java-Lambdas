package referencia;

import exercitando.Pessoa;

import java.util.Arrays;
import java.util.List;

public class CollectionInterationExemplo {
    public static void main(String[] args) {
        List<Pessoa> populacao = Arrays.asList(
                new Pessoa("Joao", "Silva", 33),
                new Pessoa("Pedro", "Block", 14),
                new Pessoa("Manuel", "Cinxa", 54),
                new Pessoa("Enzo", "Ziga", 78),
                new Pessoa("Marcelo", "Fonseca", 44),
                new Pessoa("Joana", "Casulo", 17)
        );

        System.out.println("Usando for loop de indices");
        for (int i = 0; i < populacao.size(); i++) {
            System.out.println(populacao.get(i));
        }

        System.out.println("Usando for in loop de objetos");
        for (Pessoa p : populacao){
            System.out.println(p);
        }

        System.out.println("Usando for each loop com lambdas");
        populacao.forEach(p-> System.out.println(p));
        populacao.forEach(System.out::println);
    }
}
