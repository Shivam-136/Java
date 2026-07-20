public  class LargestNumber {

    static int largest(int a, int b, int c) {
    
        if(a>=b && a>=c)
            return a;
        else if (b>=a && b>=c)
            return b;
        else 
            return c;
    }
    public static void main(String[] args) {
        System.out.println(largest (10,30,30));
    }
}