import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
    public static void main(String[] args) {
        //run in cmd
        try {
            FileInputStream fIn = new FileInputStream("C:\\Users\\pooja.modi\\IdeaProjects\\text.txt");
            int i;
            while ((i = fIn.read()) != -1) {
                System.out.print((char) i);
            }
            FileOutputStream fOut = new FileOutputStream("C:\\Users\\pooja.modi\\IdeaProjects\\text.txt", true);
            String s = System.lineSeparator() + "Append text in file using FileOutputStream";
            fOut.write(s.getBytes());

            fIn.close();
            fOut.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}
