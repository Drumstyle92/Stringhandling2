import java.util.Arrays;

/**
 * @author Drumstyle92
 * class that holds the heart of the program.
 */
public class Test {
    /**
     * @param args main parameter.
     * method where we find strings, methods on strings and a printed array.
     */
    public static void main(String[] args) {
        // strings creation
        String string1 = " United Kingdom ";
        String string2 = " Germany ";
        // extraction on the first string
        String sub1 = string1.substring(0,7);
        String sub2 = string1.substring(8,15);
        // connections between the extracted parts and the string 2
        String sub3 = sub1.concat(string2);
        String sub4 = sub3.concat(sub2);
        // all uppercase result
        String result = sub4.toUpperCase();
        // string to array conversion
        char[] charArray = result.toCharArray();

        System.out.println("---------------------------------");
        System.out.println(Arrays.toString(charArray));
        System.out.println("---------------------------------");

    }
}
