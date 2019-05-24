import annotations.Author;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        for (Method method : ExampleClass.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Author.class)) {
                System.out.println(String.format("Method %s has been implemented by %s %s.",
                        method.getName(),
                        method.getAnnotation(Author.class).name(),
                        method.getAnnotation(Author.class).surname()));
            }
        }
    }
}
