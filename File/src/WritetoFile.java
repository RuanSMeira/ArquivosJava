import java.io.FileWriter;
import java.io.IOException;

public class WritetoFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("Myfile.txt");
            fw.write("Python é melhor que java!");
            fw.close();
            System.out.println("Escrevi algo no arquivo");
        }catch (Exception e) {
            System.out.println("Ocorreu um erro.");
            e.printStackTrace();
        }
    }
}
