public class LoopUtils {

    public int findBiggestNumber(int[] arrayWithRandomNumbers) {
        int biggestNumber = arrayWithRandomNumbers[0];

        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            if (arrayWithRandomNumbers[i] > biggestNumber) {
                biggestNumber = arrayWithRandomNumbers[i];
            }
        }

        return biggestNumber;
    }

    public int[] findCommonElements(int[] arrayWithRandomNumbers, int[] arrayWithRandomNumbersTwo) {
        int[] commonElements = new int[arrayWithRandomNumbers.length];
        int commonsCounter = 0;

        for (int i = 0; i < arrayWithRandomNumbers.length; i++) {
            boolean isNumberPresent = false;

            for (int j = 0; j < arrayWithRandomNumbersTwo.length; j++) {
                if (arrayWithRandomNumbers[i] == arrayWithRandomNumbersTwo[j]) {
                    isNumberPresent = true;
                }
            }

            if (isNumberPresent) {
                commonElements[commonsCounter] = arrayWithRandomNumbers[i];
                commonsCounter++;
            }
        }

        return commonElements;
    }
}