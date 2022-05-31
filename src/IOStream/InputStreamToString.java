package IOStream;

import java.io.*;

public class InputStreamToString {
    public static void main(String[] args) {
        try {

            InputStream input = new ByteArrayInputStream("Input Stream\nTest \nDemo".getBytes());
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            //System.out.println(reader.readLine());
            String line;
            while ((line = reader.readLine())!=null) {
                System.out.println(line);
            }
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
