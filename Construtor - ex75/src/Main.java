public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Pequeno Príncipe"," Maurício de Sousa", 2014);
        System.out.println("Titulo: " + l1.getTitulo());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("ano: " + l1.getAno());
    }
}