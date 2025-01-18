public class Triangulo extends Figura {
    private double base;
    private double altura;


    public Triangulo(double base, double altura, String cor) {
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }


    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triângulo" + "\nbase: " + base + "\naltura: " + altura + "\ncor: " + getCor() + "\nárea: " + area();
    }
}
