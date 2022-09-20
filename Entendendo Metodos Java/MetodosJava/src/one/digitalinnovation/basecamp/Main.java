package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio calculadora");
        Calc.soma(3,6);
        Calc.sub(9, 1.8);
        Calc.multiplicacao(7, 8);
        Calc.divisao(5, 2.5);

        //Mensagem
        System.out.println("Mensagem");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(2);

        //Emprestimo
        System.out.println("Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
