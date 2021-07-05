package Rec;
import java.util.Scanner;
public class Mult {
    public static int Mult1(int A, int B, int Copy) {
        if (B < 1)
            return Mult1(A - Copy,B + 1,Copy);;
        if(B > 1){
            return Mult1(A + Copy,B - 1,Copy);
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Vvedite A ");
        int A = in.nextInt(), Copy = A;
        System.out.print("Vvedite B ");
        int B = in.nextInt();
        System.out.println(Mult1(A,B,Copy));
    }
}