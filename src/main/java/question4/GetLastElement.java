package question4;

public class GetLastElement {

    public static String getLastElement(String[] names) {
        return names[names.length -1];

    }


    public static void main(String[] args) {
        String[] array1 = {"bob", "steve", "jordan", "seth"};
        System.out.println(getLastElement(array1));
    }
}
