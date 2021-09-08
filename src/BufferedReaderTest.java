import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BufferedReaderTest {
    int readerbits = 10;
    String keyboardChars = "TEN";
    long l = 50L;

    public BufferedReaderTest(int readerbits, String keyboardChars) {
        this.readerbits = readerbits;
        this.keyboardChars = keyboardChars;
    }

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.youtube.com/watch?v=hb29GkWzdVE&list=PLGEPPJVr9TfOt404VxZaQK-hLkcbCrTyP&index=2");
        InputStream inputStream = url.openStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        bufferedReader.readLine();

        System.out.println("BR readline method: " + bufferedReader.readLine());
        System.out.println(System.in.read(url.toString().getBytes()));
    }

    public BufferedReaderTest copy(BufferedReaderTest bufferedReaderTest) {
        this.keyboardChars = bufferedReaderTest.keyboardChars;
        this.readerbits = bufferedReaderTest.readerbits;
        return new BufferedReaderTest(readerbits, keyboardChars);
    }
}
