import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        double preco = input.nextDouble();
        int qtdEstoque = input.nextInt();
        Produto p = new Produto(nome, preco, qtdEstoque);
        p.exibe();
        System.out.println(p.totalEstoque());
        System.out.println("Vai remover unidades do estoque?");
        System.out.print("Digite quanto vai remover ao estoque: ");
        int qtd1 = input.nextInt();
        p.removerEstoque(qtd1);
        p.exibe();
        System.out.println("Vai adicionar unidades do estoque?");
        System.out.print("Digite quanto vai adicionar ao estoque: ");
        int qtd2 = input.nextInt();
        p.adicionarEstoque(qtd2);
        p.exibe();
    }
}