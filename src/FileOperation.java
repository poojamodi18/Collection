import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) {
        //run in cmd
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\pooja.modi\\IdeaProjects\\text.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
