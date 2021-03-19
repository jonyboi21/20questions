package question1;

public class GetLastIndex {

    public static int getLastIndex(String[] names){

        return names.length - 1;

    }


    public static void main(String[] args) {
String [] array1 = {"bob", "steve", "jordan", "seth"};
        System.out.println(getLastIndex(array1));
    }
}
