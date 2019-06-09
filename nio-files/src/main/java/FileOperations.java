import java.io.IOException;
import java.nio.file.*;

public class FileOperations {

    static void removeFile(Path path) {
        try {
            Files.delete(path);
            System.out.format("File: %s has been successfully deleted.", path.getFileName());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    static void copyFile(Path source, Path target) {
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.format("File: %s has been successfully copied from %s to %s.",
                    source.getFileName(),
                    source.toString(),
                    target.toString());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    static void moveFile(Path source, Path target) {
        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.format("File: %s has been successfully moved from %s to %s.",
                    source.getFileName(),
                    source.toString(),
                    target.toString());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    static String readFile(Path path) {
        try {
            return Files.readString(path);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    static Path writeToFile(Path path, String content) {
        try {
            return Files.writeString(
                    path,
                    content,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
