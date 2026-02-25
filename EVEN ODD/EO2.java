import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n|1)>n){
		    System.out.print("even");
		}
		else{
		    System.out.print("odd");
		}
	}
}
