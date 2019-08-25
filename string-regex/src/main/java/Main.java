import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        String greeting = builder.append("Hello")
                .append(" ")
                .append("Mr")
                .append(" ")
                .append("John")
                .append(" ")
                .append("Doe")
                .toString();

        System.out.println(greeting);

        String spacesRemoved = removeSpaces(greeting);

        System.out.println(spacesRemoved);

        String secondHalf = getSecondHalf(greeting);

        System.out.println(secondHalf);

        String reversed = reverseWords(greeting);

        System.out.println(reversed);

        int number = 6;
        Integer intObj = number;


        Path path = Paths.get("src/main/resources/textToRegex.txt");

        String content = null;

        try {
            content = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        String textWithReplacements = matcher.replaceAll("#####");
//
//        System.out.println(textWithReplacements);

        String regex = "\\b[A-Za-z]{5}\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(content);

        int counter = 0;

        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter);

        String valid = "95120411391";
        String invalid1 = "5120411391";
        String invalid2 = "9a5120411391";
        String invalidToLong = "9512041139112";


        System.out.println(isPeselValid(valid));
        System.out.println(isPeselValid(invalid1));
        System.out.println(isPeselValid(invalid2));
        System.out.println(isPeselValid(invalidToLong));

    }

    private static boolean isPeselValid(String pesel) {
        String peselRegex = "\\d{11}";
        Pattern pattern = Pattern.compile(peselRegex);
        Matcher matcher = pattern.matcher(pesel);

        return matcher.matches();
    }

    private static String reverseWords(String greeting) {
        String[] words = greeting.split(" ");

        StringBuilder builder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]).append(" ");
        }

        return builder.toString().trim();
    }

    private static String removeSpaces(String greeting) {
        return greeting.replace(" ", "");
    }

    private static String getSecondHalf(String text) {
//        return text.substring(text.length() /2);
        int length = text.length();
        int half = length / 2;
        String secondHalf = text.substring(half);

        return secondHalf;
    }

}
