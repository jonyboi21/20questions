package question6;

public class getSum {

    public static int getSum1(int[] ints) {
        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
        return sum;

    }



    public static void main(String[] args) {

      int[] array1 = {3, 5, 21, 34, 1};

        System.out.println(getSum1(array1));

    }
}
