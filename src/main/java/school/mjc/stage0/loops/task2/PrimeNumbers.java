package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
         int currentNumber = 2;  // Start checking from 2, the first prime number

        while (currentNumber <= printToInclusive) {
            if (isPrime(currentNumber)) {
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
