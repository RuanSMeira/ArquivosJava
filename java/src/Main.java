import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        Aluno a1 = new Aluno(nota1, nota2, nota3);
        a1.calcularNota();
        a1.exibir();
    }
}