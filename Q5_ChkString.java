
class Q5_ChkString {

    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        String chk_Str = "se";

        // Check first two Strings end with chk_Str
        boolean chk1_Str = str1.endsWith(chk_Str);
        boolean chk2_Str = str2.endsWith(chk_Str);

        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " + "\"" + chk_Str + "\"? " + chk1_Str);
        System.out.println("\"" + str2 + "\" ends with " + "\"" + chk_Str + "\"? " + chk2_Str);
    }
}