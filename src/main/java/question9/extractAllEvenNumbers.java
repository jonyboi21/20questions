package question9;

public class extractAllEvenNumbers {


    public static String extractAllOddNumbers(int[] numbers) {

        String Numbers = "";

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 != 1) {
                Numbers += String.valueOf(numbers[i]) + " ";

            }
        }
        return Numbers;




    }



    public static void main(String[]args){
        int[] array8 = {4, 14, 25, 3, 47, 8};
        System.out.println(extractAllOddNumbers(array8));
    }


}