package question3;

public class GetFirstElement {

    public static String getFirstElement(String[] names) {
       return names[0];

    }

    public static void main(String[] args) {
        String[] array1 = {"bob", "steve", "jordan", "seth"};
        System.out.println(getFirstElement(array1));
    }
}