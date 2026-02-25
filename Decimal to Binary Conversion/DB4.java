//String
import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String b="";
        while(n>0){
            int r=n%2;
            b=Integer.toString(r)+b;
            n=n/2;
        }
        System.out.print(b);
	}
}
