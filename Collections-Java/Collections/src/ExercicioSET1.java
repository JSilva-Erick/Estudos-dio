import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSET1 {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores do arco-íris, uma em baixo da outra: ");
        for (String cor: coresArcoIris){
            System.out.println(cor);
        }
        
        System.out.println("O arco iris possui " + coresArcoIris.size() + "cores");

        System.out.println("Exiba as cores em ordem alfabetica");
        Set<String> coresArcoIsis2 = new TreeSet<>(coresArcoIris); //TreeSet já ordena por ordem alfabetica
        System.out.println(coresArcoIsis2);

        System.out.println("Exiba as cores na ordem inversa a que foi informada");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("Exiba todas as cores que começam com a letra 'v': ");
        for(String cor: coresArcoIris){
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores qeu não começam com a letra 'v'");
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            if(!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("O conjunto está vazio?: " + coresArcoIris.isEmpty());
    }
    
}
