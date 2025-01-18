public class Aluno{
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(double nota1 , double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double calcularNota(){
        if(nota1 <= 30 && nota2 <= 35 && nota3 <= 35){
        }
        return nota1 + nota2 + nota3;
    }
    public void exibir(){
        System.out.printf("NOTA FINAL = %.2f\n", calcularNota());
        if (calcularNota() >= 60){
            System.out.println("APROVADO");
        }else{
            System.out.println("REPROVADO");
            System.out.printf("FALTARAM %.2f" , 60 - calcularNota());
        }
    }
}