import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/main/resources/exampleFile.txt");

        GlobMatchers.isMatching(path);

        //path operations
        path.getFileName();
        path.getFileSystem();
        path.toAbsolutePath();
        path.toUri();
        path.toRealPath(LinkOption.NOFOLLOW_LINKS);

        Files.exists(path, LinkOption.NOFOLLOW_LINKS);
        Files.notExists(path, LinkOption.NOFOLLOW_LINKS);

        Files.isReadable(path);
        Files.isWritable(path);
        Files.isExecutable(path);
        Files.isRegularFile(path);

        FileOperations.writeToFile(Paths.get("src/main/resources/newFile.txt"), "any_value");

    }
}
