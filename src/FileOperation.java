import java.io.FileInputStream;
import java.io.FileOutputStream;
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
            FileOutputStream fout = new FileOutputStream("C:\\Users\\pooja.modi\\IdeaProjects\\text.txt", true);
            String s = System.lineSeparator() + "Append text in file using FileOutputStream";
            fout.write(s.getBytes());

            fin.close();
            fout.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
