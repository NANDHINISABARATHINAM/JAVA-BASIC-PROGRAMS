//Built-in Method
import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        BigInteger aa = BigInteger.valueOf(a);
        BigInteger bb = BigInteger.valueOf(b);
        System.out.println(aa.gcd(bb));
	}
}
