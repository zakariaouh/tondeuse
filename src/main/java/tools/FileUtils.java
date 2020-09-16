package tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtils {

    public static final String PATH_OF_TEST_FILE = "/data.txt";

    private FileUtils(){

    }
    public static String loadTestFile() throws IOException {

        Class clazz = FileUtils.class;
        InputStream inputStream = clazz.getResourceAsStream(PATH_OF_TEST_FILE);
        return readFromInputStream(inputStream);

    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader
                     br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
}
