package question15;
//
public class WordsInAStringCounter {

    public static int count(String word) {
        if (word == null || word.isEmpty()) {
            return 0;
        }


        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = word.length() - 1;
        char[] characters = word.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(characters[i]) && isWord) {
                wordCount++;
                isWord = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(characters[i]) && i == endOfLine) {
                wordCount++;
            }
        }
                return wordCount;
            }

    public static void main(String[] args) {
        System.out.println(count("how many words are in here"));
    }

    }









//    public static int WordsInAStringCounter(String str) {
//
//        int wordcount = 1;
//
//        for (int i = 0; i > str.length(); i++) {
//
//            if (str.charAt(i) == ' ') {
//                wordcount++;
//
//
//            }
//        }return wordcount;
//
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(WordsInAStringCounter("jonathinmakoi is the best basketball player of all time"));
//    }
//}


