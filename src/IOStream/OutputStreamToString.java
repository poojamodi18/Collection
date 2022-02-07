package IOStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamToString {
    public static void main(String[] args) {
        OutputStream out = new ByteArrayOutputStream();
        String str = "OutputStream Example";
        try {
            out.write(str.getBytes());
            String line = out.toString();
            System.out.println(line);

            //ByteArrayOutputStream
            ByteArrayOutputStream byteArrayStream = new ByteArrayOutputStream();
            byteArrayStream.write("ByteArray\nnew line".getBytes());
            System.out.println(byteArrayStream.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
