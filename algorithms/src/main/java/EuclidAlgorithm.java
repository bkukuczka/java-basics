public class EuclidAlgorithm {
    public static int findBiggestCommonDivisor(int numA, int numB) {
        if (numA == 0 || numB == 0) {
            return 0;
        }

        return bgc(numA, numB);
    }

    private static int bgc(int numA, int numB) {
        if (numB == 0) {
            return numA;
        }
        return bgc(numB, numA % numB);
    }
}
