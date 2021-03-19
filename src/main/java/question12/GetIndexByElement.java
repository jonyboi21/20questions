package question12;

public class GetIndexByElement {




    public static int getIndexByElement(String[] names, String element) {
        if (names == null) return -1;
        int len = names.length;
        int i = 0;
        while (i < len)
            if (names[i] == element) return i;
            else i = i + 1;


        return 0;
    }



    public static void main(String[] args) {

        String[] array4 = {"jon", "jon1", "jon2", "jon3","jon4"};
        System.out.println(getIndexByElement(array4, "jon4"));

    }
}
