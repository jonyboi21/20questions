package question2;



public class Get2ndtoLastIndex {

    public static int getLastIndex(String[] names){

        return names.length - 2;

    }


    public static void main(String[] args) {
        String [] array1 = {"bob", "steve", "jordan", "seth"};
        System.out.println(getLastIndex(array1));
    }
}