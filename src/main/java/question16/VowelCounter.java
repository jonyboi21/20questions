package question16;

public class VowelCounter {

    public static int VowelsCounter(String str){
            int count = 0;
        for (int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                count++;

            }
        }


        return count;


    }

    public static void main(String[] args) {
        System.out.println(VowelsCounter("Jonathin Makori"));
    }



}
