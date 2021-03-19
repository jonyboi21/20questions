package question5;

public class getSecondToLastElement {
    public static String getSecondToLastElement1(String[] names) {
        return names[names.length -2];
    }




    public static void main(String[] args) {
        String[] array1 = {"bob", "steve", "jordan", "seth"};
        System.out.println(getSecondToLastElement1(array1));
    }
}







