import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int idade = sc.nextInt();
        double mediaNota = sc.nextDouble();
        Estudante e =  new Estudante(nome, idade, mediaNota);
        System.out.println(e.verificaMedia());
        e.exibe();
    }
}