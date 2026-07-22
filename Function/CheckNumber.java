public class CheckNumber {
    
    static void check(int num){

        if(num>0)
            System.out.println("positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
    public static void main(String[] args) {
        check(10);
    }
}
