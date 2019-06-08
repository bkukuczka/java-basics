import exceptions.EmptyFileNameException;
import readers.ModernReader;
import readers.OldReader;

public class Main {
    public static void main(String[] args) {
        String fileName = "src\\main\\resources\\exampleFile.txt";

        String oldContent = OldReader.read(fileName);
        System.out.println(oldContent);

        try {
            String modernContent = ModernReader.read(fileName);
            System.out.println(modernContent);
        } catch (EmptyFileNameException e) {
            System.err.println(e.getMessage());
        }
    }
}
