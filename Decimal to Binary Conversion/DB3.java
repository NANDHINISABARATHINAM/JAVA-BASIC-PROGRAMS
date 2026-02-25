//Math.pow()
import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=0;
        int i=0;
        while(n>0){
            int r=n%2;
            double c=Math.pow(10,i);
            b+=r*c;
            n=n/2;
            i++;
        }
        System.out.print(b);
	}
}
