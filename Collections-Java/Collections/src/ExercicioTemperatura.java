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

        for (int i = 0; i < temperaturas.size(); i++){
            if (temperaturas.get(i) >= media) {
                if(i==0) System.out.println(i+1 + " - Janeiro :");
                if(i==1) System.out.println(i+1 + " - Fevereiro :");
                if(i==2) System.out.println(i+1 + " - Março :");
                if(i==3) System.out.println(i+1 + " - Abril :");
                if(i==4) System.out.println(i+1 + " - Maio :");
                if(i==5) System.out.println(i+1 + " - Junho :");
                System.out.println(temperaturas.get(i));
            }
        }
    }
}
    
