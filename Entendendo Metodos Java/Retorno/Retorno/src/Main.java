public class Main {
    public static void main(String[] args) {
        //Retornos
        System.out.println("Exercícios retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do Retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do Trapezio: " + areaTrapezio);

        double areaLosango = Quadrilatero.area(3f, 5f);
        System.out.println("Área do Losango: " + areaLosango);

    }


}

