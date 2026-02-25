/* 1. Using Arrays
Algorithm
Store the remainder when the number is divided by 2 in an array.
Divide the number by 2
Repeat the above two steps until the number is greater than zero.
Print the array in reverse order now.
  */
import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int b[]=new int[1000];
        int i=0;
        while(n>0){
            b[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(b[j]);
        }
	}
}
