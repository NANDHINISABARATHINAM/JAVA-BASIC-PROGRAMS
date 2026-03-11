import java.util.Scanner;

public class PyramidNumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0;
        for (int i = 1; i <= n; i++) {
            for (int j =n-1-i ; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int j =0 ; j < i; j++) {
                x=i+j;
                System.out.print(x+" ");
            }
            for (int j =0 ; j < i-1; j++) {
                System.out.print(--x+" ");
            }
            for (int j =n-1-i ; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
