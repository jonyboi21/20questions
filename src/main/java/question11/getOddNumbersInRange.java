package question11;

public class getOddNumbersInRange {
    public static void printOddNumbersInRange(int start, int end) {


        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                System.out.println(i + " ");

            }
        }



        }

    public static void main(String[] args) {
        printOddNumbersInRange(1, 20);
    }


    }
