package question17;

import java.util.Arrays;

public class SwapFirstElement {

    public static String swap(String[] stringArray) {
        {


            String x = stringArray[0];
            stringArray[0] = stringArray[stringArray.length - 1];
            stringArray[stringArray.length - 1] = x;
            return "New array after swaping the first and last elements: " + (Arrays.toString(stringArray));
        }
    }

    public static void main(String[] args) {

        String[] jon1 = {"ji","ij", "ok", "ko"};

        System.out.println(swap(jon1));
    }

}
