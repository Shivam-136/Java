public class Armstrong {

    static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}