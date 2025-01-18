public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(10, 5, "verde");
        Quadrado quadrado = new Quadrado(4, "azul");
        Triangulo triangulo = new Triangulo(6, 8, "vermelho");
        Circulo circulo = new Circulo(7,"amarelo");

        System.out.println("\n" + retangulo.toString());
        System.out.println("\n" + quadrado.toString());
        System.out.println("\n" + triangulo.toString());
        System.out.println("\n" + circulo.toString());

    }
}
