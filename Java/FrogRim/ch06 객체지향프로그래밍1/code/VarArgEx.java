public class VarArgEx {
    public static void main(String[] args) {
        String[] strArr = {"100","200","300"};

        System.out.println();
        System.out.println();
    }

    static String concatenate(String delim, String...args){

        String result = " ";

        for (String str : args){

            result += str + delim;

        }

        return result;
    }


}
