public class Main {
    public static void main(String[] args) {
        ArrayFactory arrayFactory = new ArrayFactory(20);

        int[] arrayWithRandomNumbers = arrayFactory.createArrayWithRandomNumbers(0, 30);

        int[] arrayWithRandomNumbersTwo = arrayFactory.createArrayWithRandomNumbers(10, 40);

        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            System.out.println(arrayWithRandomNumbers[i]);
        }

        System.out.println("---");
        for (int i = 0; i < arrayWithRandomNumbersTwo.length; i++) {
            System.out.println(arrayWithRandomNumbersTwo[i]);
        }

        LoopUtils loopUtils = new LoopUtils();

        int biggestNumber = loopUtils.findBiggestNumber(arrayWithRandomNumbers);

        int[] commonElements = loopUtils.findCommonElements(arrayWithRandomNumbers, arrayWithRandomNumbersTwo);

        System.out.println("---");
        for (int i = 0; i < commonElements.length; i++) {
            System.out.println(commonElements[i]);
        }
    }
}
