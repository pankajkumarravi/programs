package exam;
import java.util.Scanner;

public class CountNoOfDidits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to count digits");
		int c=sc.nextInt();
		int count=countNoOfDigits(c);
		System.out.println("count digits=" +count);

	}
	static int countNoOfDigits(int c)
	{
		int dc=0;
		do{ 
			dc++;
			c=c/10;
		}
		while(c!=0);
		return dc;
	}
}

