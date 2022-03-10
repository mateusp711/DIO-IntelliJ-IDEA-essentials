package aplicacoes;

public class Main {

    public static void main(String[] args) {

        // calculadora
        System.out.println("Atividade de calculadora");
        calculadora.soma(3,5);
        calculadora.subtracao(4,6);
        calculadora.multiplicacao(5,7);
        calculadora.divisao(6,8);

        // mensagens
        System.out.println("Atividade de mensagens");
        mensagem.obterMensagem( 9);
        mensagem.obterMensagem(15);
        mensagem.obterMensagem(22);

        //emprestimo
        System.out.println("Atividade de Emprestimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);



    }
}
