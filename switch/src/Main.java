import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("State month of your birth:");

        String month = scanner.nextLine();

        System.out.println("Your zodiac sign is:");

        switch (month) {
            case "January":
                System.out.println("Aquarius");
                break;
            case "February":
                System.out.println("Pisces");
                break;
            case "March":
                System.out.println("Aries");
                break;
            case "April":
                System.out.println("Taurus");
                break;
            case "May":
                System.out.println("Gemini");
                break;
            case "June":
                System.out.println("Cancer");
                break;
            case "July":
                System.out.println("Leo");
                break;
            case "August":
                System.out.println("Virgo");
                break;
            case "September":
                System.out.println("Libra");
                break;
            case "October":
                System.out.println("Scorpio");
                break;
            case "November":
                System.out.println("Sagittarus");
                break;
            case "December":
                System.out.println("Capricorn");
                break;
            default:
                System.out.println("Unicorn");
        }
    }
}
