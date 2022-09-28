import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.sound.midi.Soundbank;

public class ExemploList {
    public static void main(String[] args) {
        // List<Double> notas = new ArrayList<>();
        // ArrayList<Double> notas = new ArrayList<>();
        // List<Double> notas - new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /* List<Double> notas = ArraysasList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);
 */
        /* List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas); */

        System.out.println("Crie uma lista e adicione as sete notas");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());
        
        System.out.println("Exiba a posição da nota 5.0:" + notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8d); // adciona valor na lista na posição desejada
        System.out.println(notas);

        System.out.println("Subistitua a nota 5;0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // substituir valores na posição desejada
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //verifica se contem o valor desejado na lista
        System.out.println("Exiba todas as notas na ordem em que forma  informados: ");
        for (Double nota : notas) System.out.println(nota); // passa por cada item da lista e imprime

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));//pega a informação da posição indicada
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){// verifica se possiu próximo valor booleano
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0:");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
     
        System.out.println("Crie uma lista chamada notas2 ");
        List<Double> notas2 = new LinkedList<>();
        notas2.add(9d);
        notas2.add(7d);
        notas2.add(4d);
        notas2.add(5.6);
        notas2.add(3.8);
        notas2.add(6.7);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo " + notas2.get(0));

        notas2.remove(0);
        System.out.println("Mostre a primeira nota da nova lista removendo-o " + notas2.get(0));
    }
}
