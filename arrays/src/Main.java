public class Main {
    public static void main(String[] args) {
        //declaration and initialization of 5 element int array
        int[] numbers = new int[5];
        int numbersPrim[] = new int[5];

        //filling in of 3 from 5 spots in array
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 15;

        //declaration, initialization and filling in of 3 element char array
        char[] characters = {'a', 'b', 'c'};

        //two-dimension array of arrays
        int[][] calendar = new int[12][31];
        calendar[0][0] = 1;     //1st January
        calendar[0][1] = 2;     //2nd January
        calendar[6][8] = 9;     //9th June
        calendar[11][9] = 10;   //10th November
    }
}
