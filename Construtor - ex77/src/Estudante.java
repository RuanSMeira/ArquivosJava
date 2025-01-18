public class Estudante {
    String nome;
    int idade;
    double mediaNota;
    public Estudante(String nome, int idade, double mediaNota) {
        this.nome = nome;
        this.idade = idade;
        this.mediaNota = mediaNota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getMediaNota() {
        return mediaNota;
    }
    public void setMediaNota(double mediaNota) {
        this.mediaNota = mediaNota;
    }
    public String verificaMedia () {
        if(mediaNota >= 7){
            return "Aprovado";
        }else{
            return "Reprovado";
        }
    }
    public void exibe() {
        System.out.println("Nome do Estudante: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Média de notas: " + mediaNota);
    }
}
