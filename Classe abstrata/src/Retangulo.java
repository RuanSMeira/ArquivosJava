public class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }


    public double area() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return "Retângulo" + "\nlado1: " + lado1 + "\nlado2: " + lado2 + "\ncor: " + getCor() + "\nárea: " + area();
    }
}
