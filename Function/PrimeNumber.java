public class PrimeNumber {
    
    static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        if (isPrime(13))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
