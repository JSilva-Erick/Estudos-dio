import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        String[] perguntas = {"Telefonou para vítima?", "Esteve no local do crime?",
        "Mora perto da vítima?", "Devia para a vítima?","Já trabalhou com a vítima?"};
        ArrayList<String> respostas = new ArrayList<String>();

        for (String string : perguntas) {
            System.out.println("Responda com 'S' para Sim e 'N' para Não!");
            System.out.println(string);
            String resposta = scan.next();
            respostas.add(resposta);
        }

        System.out.println(respostas);
        for (String teste : respostas) {
            if (teste.toUpperCase().contains("S")){
                soma = soma + 1;
            }
        }
        System.out.println("Você teve um total de " + soma + " acusações!");
        switch (soma) {
            case 2:
                System.out.println("Suspeito");
                break;
        
            case 3,4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assasina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
    }
    
}
