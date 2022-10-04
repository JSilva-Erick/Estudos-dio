import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


/* Dada a população estima de alguns estados do NE brasileiro, faça:
Estadp = PR - Popilação = 9616621
Estadp = AL - Popilação = 3351543
Estadp = CE - Popilação = 9187103
Estadp = RN - Popilação = 3534265
*/
public class ExercicioMap1 {
    public static void main(String[] args) {
        //Crie um dicionario e relacione os estados e suas populações;
        Map<String, Integer> estados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println(estado.getKey() +" - " + estado.getValue());            
        }
        System.out.println("\n");
        //Substitua a população do estado do RN por 3.534.165
        estados.put("RN", 3534165);
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println(estado.getKey() +" - " + estado.getValue());            
        }
        //Confira se o estado PB está no dicionário, caso não adicione: PB - 4039277
        System.out.println("\n");
        System.out.println("Possui PB ná lista?: " + estados.containsKey("PB"));
        if (!estados.containsKey("PB")) {
            estados.put("PB", 4039277);            
        }
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println(estado.getKey() +" - " + estado.getValue());            
        }
        //Exiba a população de PE
        System.out.println("\nA população de PE é: " + estados.get("PE"));

        //Exiba todos os estados e suas populações na ordem que foi informado;
        Map<String, Integer> estados1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("\n");
        for (Map.Entry<String, Integer> estado : estados1.entrySet()) {
            System.out.println(estado.getKey() +" - " + estado.getValue());            
        }
        //Exiba os estados e suas populações em ordem alfabética
        System.out.println("\n");
        Map<String, Integer> estados2 = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println("\n");
        for (Map.Entry<String, Integer> estado : estados2.entrySet()) {
            System.out.println(estado.getKey() +" - " + estado.getValue());            
        }
        //Exiba o estado com menor pupulação e sua quantidade
        System.out.println("\n");
        int menor = Collections.min(estados.values());
        String menorPopulação = "";
        for (Entry<String,Integer> entry : estados.entrySet()) {
            if (entry.getValue().equals(menor))
            menorPopulação = entry.getKey();
        }
        System.out.println(menorPopulação + " tem a menor população: " + menor);
        //Exiba os estados com a maior população e sua quantidade
        System.out.println("\n");
        int maior = Collections.max(estados.values());
        String maiorPopulacao = "";
        for (Entry<String,Integer> entry : estados.entrySet()) {
            if (maior == entry.getValue()) {
                maiorPopulacao = entry.getKey();                
            }            
        }
        System.out.println("O estado de " + maiorPopulacao + " tem a maior população com " + maior +"\n");
        //Exiba a soma da população desses estados
        int soma = 0;
        for (Entry<String, Integer> entry : estados.entrySet()) {
            soma += entry.getValue();            
        }
        System.out.println("Soma total da população: " + soma);
        //Exiba a media da população
        System.out.println("A media da população é: " + soma/estados.size() + "\n");
        //Remova os estados com a população menor que 4.000.000
        Iterator<Integer> Iterator = estados.values().iterator();
        while(Iterator.hasNext()){
            if(Iterator.next() < 4000000) Iterator.remove();
        }
        for (Map.Entry<String, Integer> estado : estados.entrySet()) {
            System.out.println(estado.getKey() +" - " + estado.getValue());            
        }
        //Apague o dicionario e confira se está vazio
        estados.clear();
        System.out.println("O dicionario está vazio? " + estados.isEmpty());

       }
        
}
