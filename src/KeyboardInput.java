public class KeyboardInput extends BufferedReaderTest {

    public KeyboardInput(int readerbits, String keyboardChars) {
        super(readerbits, keyboardChars);
    }

    public static void main(String[] args) {
        BufferedReaderTest bufferedReaderTest1 = new BufferedReaderTest(4, "four");
        BufferedReaderTest bufferedReaderTest2 = new BufferedReaderTest(5, "five");

        bufferedReaderTest1.copy(bufferedReaderTest2);

        System.out.println("Copy test result: " + bufferedReaderTest1.readerbits +" " +bufferedReaderTest1.keyboardChars);
    }
}
