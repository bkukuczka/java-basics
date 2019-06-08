import readers.OldReader;

public class Main {
    public static void main(String[] args) {
        String fileName = "src\\main\\resources\\exampleFile.txt";
        String fileContent = OldReader.readFile(fileName);

        System.out.println(fileContent);
    }
}
