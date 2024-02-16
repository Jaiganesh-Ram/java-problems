public class PrimeChecker {

    public static void main(String[] args) {
        // Example: Check if 16 is prime
        int numberToCheck = 16;

        if (isPrime(numberToCheck)) {
            System.out.println(numberToCheck + " is a prime number.");
        } else {
            System.out.println(numberToCheck + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // Check for factors up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // If the number is divisible by any other number, it's not prime
                return false;
            }
        }

        // If no factors found, the number is prime
        return true;
    }
}