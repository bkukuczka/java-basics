public class ArrayFactory {
    private int arraySize;

    public ArrayFactory(int arraySize) {
        this.arraySize = arraySize;
    }


    public int[] createArrayWithRandomNumbers(int lowerBound, int upperBound) {
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (upperBound - lowerBound)) + lowerBound;
        }

        return array;
    }
}
