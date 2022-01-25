import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        //Read from string using scanner
        String string = "Read from string using scanner";
        Scanner stringScanner = new Scanner(string);
        System.out.println(stringScanner.nextLine());
        //Read from terminal using scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String strInput = scanner.nextLine();
        System.out.println("Entered String : "+strInput);
        //Read from file using scanner
        try {
            FileReader fin = new FileReader("C:\\Users\\pooja.modi\\IdeaProjects\\text.txt");
            Scanner sc = new Scanner(fin);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
