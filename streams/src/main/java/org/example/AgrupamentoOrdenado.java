package org.example;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AgrupamentoOrdenado {
    public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
                new Pessoa("Carlos", 20),
                new Pessoa("Ana", 22),
                new Pessoa("Bruno", 20),
                new Pessoa("Eduarda", 25),
                new Pessoa("Diana", 30),
                new Pessoa("Beto", 20),
                new Pessoa("Maria", 25),
                new Pessoa("Daniela", 30)
        );

        //Agrupar por idade e ordenar pelas chaves (idade)
        Map<Integer, List<Pessoa>> agrupadoOrdenado = pessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getIdade,
                        TreeMap::new,
                        Collectors.toList()
                ));

        //Exibir o mapa ordenado
        agrupadoOrdenado.forEach((idade, lista) -> {
            System.out.println("Idade " + idade + ":");
            lista.forEach(p -> System.out.println(" - " + p));
        });
    }
}
