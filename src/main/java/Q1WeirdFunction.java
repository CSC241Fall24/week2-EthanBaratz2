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
        
        int f1 = 2;
        int f2 = 1;
        int f3 = 0;
        int fn = 0;

        for(int i = 3; i <= n; i++) {
            fn = f1 + 2 * f2 + 3 * f3;

            f3 = f2;
            f2 = f1;
            f1 = fn;
        }
        return fn;
    }
}
