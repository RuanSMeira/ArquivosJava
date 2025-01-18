import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("MyFile.txt");
        if (myObj.exists()) {
            System.out.println("Nome do arquivo: " + myObj.getName());
            System.out.println("Endereço do arquivo: " + myObj.getAbsolutePath());
            System.out.println("Pode ser editado: " + myObj.canWrite());
            System.out.println("Pode ser lido: " + myObj.canRead());
            System.out.println("Tamanho do arquivo: " + myObj.length() + " Bytes");
        }else{
            System.out.println("O arquivo não existe.");
        }
    }
}
