package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int currentNumber = 0;

        while (currentNumber <= printToInclusive) {
            long factorial = calculateFactorial(currentNumber);
            System.out.println("Factorial of " + currentNumber + ": " + factorial);
            currentNumber++;
        }
    }

    private long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        long result = 1;
        int i = 2;

        while (i <= num) {
            result *= i;
            i++;
        }

        return result;
    }

    }
}
