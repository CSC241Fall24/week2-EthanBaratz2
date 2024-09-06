// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
         if(s.equals("")) return "";
        else {
           return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}
