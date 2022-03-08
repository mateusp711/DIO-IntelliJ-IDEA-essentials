public class Main {

        public static void main(String[] args) {

            int i;
            //int i; variaveis com o mesmo valor causam erros//
            int I;
            //int 1a; variaveis inciadas com número dão erros//
            int a1;
            int _1a; //não uma boa prática//
            int $1a; //''//

            i = 10;
            I = 11;
            a1 = 12;
            _1a = 13;
            $1a = 14;

            final int j = 10;
            //j = 15; variavel com mesmo nome da variavel anterior, final, e valores diferentes//
            //int asdashud asdada; variavel com espaço causa erro//
            //int dsadsa%dsxds; variavel com charactere proíbido//
            int duhsadha_dsada;
            int dhsuahduashd;

            duhsadha_dsada = 15;
            dhsuahduashd = 16;

            int quantidadeProduto = 50;
            //int QuantidadedeProduto; funcionaria, porém não segue a boa prática de minuscula ao começo//
            final int NUMERO_TENTATIVAS = 5;
            //final int numeroTentativas = 5; Não daria erro, porém não segue a boas práticas para variavéis final//
            //int QUANTIDADE_OPCOES = 25; Não dria erros, porém segue a prática de int final em uma int normal//
            //int qtdprod;  Difícil entendimento//

            System.out.println(i);
            System.out.println(I);
            System.out.println(a1);
            System.out.println(_1a);
            System.out.println($1a);
            System.out.println(j);
            System.out.println(duhsadha_dsada);
            System.out.println(dhsuahduashd);
            System.out.println(quantidadeProduto);
            System.out.println(NUMERO_TENTATIVAS);







        }
}


