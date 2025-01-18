import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("MyFile.txt");
            if (myObj.createNewFile()) {
                System.out.println("Arquivo Criado: " + myObj.getName());
            }else {
                System.out.println("Arquivo já criado");
            }
        }catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}