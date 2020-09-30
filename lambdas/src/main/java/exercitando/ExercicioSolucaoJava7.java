package exercitando;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioSolucaoJava7 {

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
        Collections.sort(populacao, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getUltimoNome().compareTo(o2.getUltimoNome());
            }
        });

        //Passo 2: Criar um method que printa todos os elementos
        for (Pessoa p : populacao) {
            System.out.println(p);
        }

        //Passo 3: Criar um method que printa todos os elementos onde o ultimo nome comeca com a Letra C
        listarComCondicao(populacao, new CodicaoEspecial() {
            @Override
            public boolean teste(Pessoa p) {
                return  p.getUltimoNome().startsWith("C");
            }
        });
    }
    interface CodicaoEspecial{
        boolean teste(Pessoa p);
    }

    private static void listarComCondicao (List<Pessoa> pessoas, CodicaoEspecial codicao){
        for (Pessoa p : pessoas) {
            if(codicao.teste(p)){
                System.out.println(p);
            }

        }
    }



}
