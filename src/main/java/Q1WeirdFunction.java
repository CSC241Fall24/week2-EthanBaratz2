// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if(n < 3) return n;
        else {
            return fRecursive(n-1) + (2 * fRecursive(n-2)) + (3 * fRecursive(n-3));
        }
    }

    public static int fIterative(int n) {
        if(n < 3) return n;
        int fn = 0;
        int j = 1;
        for(int i = n; i > 0; i--) {
            fn += j * (i - 1);
            j++;
        }
        return fn;
    }
}
