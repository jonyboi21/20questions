package question10;

public class booleancontains {
    public static boolean contains(String[] names, String element)
    {


        for (int Count = 0 ; Count< names.length ; Count++){
            if(element == names[Count]){
                return true;

            }else return false;
        }


        return false;
    }



    public static void main(String[] args) {
String[] array2 = {"jon", "jon1", "jon2", "jon3", "jon4"};

        System.out.println(contains(array2, "jon0"));

    }
}
