package question13;

public class PrintStringTimesNumberGiven {


    public static String printGivenStringTimesNumberGiven(String str, int n) {

        String string1 = "";


        for (int i = 0; i < n; i++) {
            string1 += str;


        }
        return string1;

    }
        public static void main (String[]args){


            System.out.println(printGivenStringTimesNumberGiven("jon ", 2));
        }
    }

