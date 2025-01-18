public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }


    public double getRaio() {
        return raio;
    }


    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getDiametro() {
        return 2 * raio;
    }

    @Override
    public String toString() {
        return "Círculo \nraio: " + raio + "\ncor: " + getCor() + "\nárea: " + area() + "\ndiâmetro: " + getDiametro();
    }
}
