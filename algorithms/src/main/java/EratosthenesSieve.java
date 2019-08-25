import java.util.ArrayList;
import java.util.List;

public class EratosthenesSieve {
    public static List<Integer> findPrimeNumbers(int upperLimit) {

        boolean prime[] = new boolean[upperLimit + 1];

        for (int i = 0; i < upperLimit; i++) {
            prime[i] = true;
        }

        for (int p = 2; p * p <= upperLimit; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= upperLimit; i += p)
                    prime[i] = false;
            }
        }

        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= upperLimit; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
}