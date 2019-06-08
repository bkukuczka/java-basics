package readers;

import java.io.*;

public class OldReader {
    /**
     * Old style file reader (pre Java 7)
     */
    public static String read(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s", e);

        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();

                if (fileReader != null)
                    fileReader.close();

            } catch (IOException ex) {
                System.err.format("IOException: %s", ex);
            }
        }

        return stringBuilder.toString();
    }
}
