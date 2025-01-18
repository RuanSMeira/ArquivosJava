public class Main {
    public static void main(String[] args) {

        Transporte tc = new Carro();
        tc.mover();

        Transporte tb = new Bicicleta();
        tb.mover();

        Transporte ta = new Aviao();
        ta.mover();
    }
}