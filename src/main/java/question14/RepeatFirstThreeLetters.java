package question14;

public class RepeatFirstThreeLetters {


    public static String repeatFirstThreeLetters(String str, int n) {
        String string2 = str.substring(0,3);
        String string1 = "";


        for (int i = 0; i < n; i++) {
            string1 += string2;

        }
        return string1;
    }


    public static void main(String[] args) {
        System.out.println(repeatFirstThreeLetters("jonathin ", 4));

    }
}
