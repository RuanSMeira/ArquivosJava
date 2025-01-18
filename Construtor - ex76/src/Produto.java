public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;
    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    public double totalEstoque() {
        return preco * qtdEstoque;
    }
    public void removerEstoque(int quantidade) {
        if (quantidade >= 0 && quantidade <= this.qtdEstoque) {
            this.qtdEstoque -= quantidade;
        }
    }
    public void adicionarEstoque(int quantidade) {
        if (quantidade >0){
            this.qtdEstoque += quantidade;
        }
    }
    public void exibe() {
        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preço do Produto: " + preco);
        System.out.println("Estoque do Produto: " + qtdEstoque);
    }
}
