package Atividade04;

public class Main {

    public static void main(String[] args) {

        // retornos
        System.out.println("Atividade de quadreiláteros parte 2");


        double areaQuadrado = quadrilatero2.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = quadrilatero2.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = quadrilatero2.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
