import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class GlobMatchers {
    static boolean isMatching(Path filePath) {
        PathMatcher pathMatcher1 = FileSystems.getDefault().getPathMatcher("glob:src/main/*/exampleFile.txt");
        PathMatcher pathMatcher2 = FileSystems.getDefault().getPathMatcher("glob:src/**/exampleFile.txt");
        PathMatcher pathMatcher3 = FileSystems.getDefault().getPathMatcher("glob:src/????/resources/exampleFile.txt");
        PathMatcher pathMatcher4 = FileSystems.getDefault().getPathMatcher("glob:src/{main, subsidiary}/resources/exampleFile.txt");
        PathMatcher pathMatcher5 = FileSystems.getDefault().getPathMatcher("glob:src/[a-z]/resources/exampleFile.txt");

        return pathMatcher1.matches(filePath);
    }
}
