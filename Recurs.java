package Rec;
import java.util.Scanner;
public class Recurs {
    public static int fact1(int n){
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
    // 5! = (1 * 2 * 3 * 4) * 5 = 120
    public static int fact2(int n){
        if (n == 0) return 1;
        else return n * fact2(n-1);
    }

    public static int fact3(int n){
        return (n == 0) ? 1 : n * fact3(n - 1);
    }
    //        0 1 1 2 3 5 8 13 ...

    public static int fib1(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            int f1 = 0;
            int f2 = 1;
            for (int i = 2; i < n; i++) {
                f2 = f2 + f1;
                f1 = f2 - f1;
            }
            return f1 + f2;
        }
    }
//    0
//    1
//    1 = 1 + 0 = fib(1) + fib(0)
//    2 = 1 + 1 = fib(2) + fib(1)
//    3 = 2 + 1 = fib(3) + fib(2)
//    5 = 3 + 2 = fib(4) + fib(3)

    public static int fib3(int n){
        return (n > 1) ? fib2(n - 1) + fib2(n - 2) : (n == 1) ? 1 : 0;
    }

    public static int fib2(int n){
        if (n > 1) {
            return fib2(n - 1) + fib2(n - 2);
        }
        else{
            if( n == 1) return 1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 0)
            System.out.println(fib2(n));
    }
}
