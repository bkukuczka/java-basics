package readers;

import exceptions.EmptyFileNameException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ModernReader {
    /**
     * Java 7 file reading
     */
    public static String read(String fileName) throws EmptyFileNameException {
        checkFile(fileName);

        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s", e);
        }

        return stringBuilder.toString();
    }

    private static void checkFile(String fileName) throws EmptyFileNameException {
        if (fileName.isEmpty()) {
            throw new EmptyFileNameException(
                    "File name cannot be empty");
        }
    }


}
