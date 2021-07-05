package Rec;
import java.util.Scanner;
public class Nod {
    public static int Nod1(int A, int B, int nod) {
        if (B == 0 && A == B) {
            System.out.println("NOD: " + A);
            return A;
        }
        else if (A == 0) {
            System.out.println("NOD: " + B);
            return B;
        }
        int NOD;
        if (A > B) {
            NOD = B - nod;
            while (NOD > 0) {
                if (B % NOD == 0 && A % NOD == 0) {
                    System.out.println("NOD: " + NOD);
                    return NOD;
                }
                return Nod1(A, B, nod + 1);
            }
        }
        else {
            NOD = A - nod;
            while (NOD > 0) {
                if (A % NOD == 0 && B % NOD == 0) {
                    System.out.println("NOD: " + NOD);
                    return NOD;
                }
                return Nod1(A, B, nod + 1);
            }
        }
        return NOD;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("Vvedite A ");
            int A = in.nextInt(), nod = 0;
            System.out.print("Vvedite B ");
            int B = in.nextInt();
            System.out.println(Nod1(A,B,nod));
    }
}
