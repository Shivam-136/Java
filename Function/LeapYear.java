public class LeapYear {
    
    static void CheckLeapYear(int year){

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

    public static void main(String[] args) {
        CheckLeapYear(2020);
    }
}
