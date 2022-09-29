import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExercicioTemperatura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        double soma = 0d;
        for (int i = 1; i <= 6; i++){
            System.out.println("Qual a temperatura do mês " +i+ ": ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }

        System.out.println(temperaturas);

        double media = soma/temperaturas.size();
        System.out.println(media);
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

        for (int i = 0; i < temperaturas.size(); i++){
            if (temperaturas.get(i) >= media) {
                System.out.println(meses[i] + " = " + temperaturas.get(i));
            }
        }
    }
}