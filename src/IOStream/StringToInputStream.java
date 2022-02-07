package IOStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StringToInputStream {
    public static void main(String[] args) {
        String line = "Convert to stream";
        InputStream input = new ByteArrayInputStream(line.getBytes());
        try {
            System.out.println((char) input.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
