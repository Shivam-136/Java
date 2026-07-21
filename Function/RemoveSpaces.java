public class RemoveSpaces{

    static String removeSpaces(String str) {

        return str.replace(" ", "");
    }

    public static void main(String[] args) {

        System.out.println(removeSpaces("Java    Programming"));
    }
}