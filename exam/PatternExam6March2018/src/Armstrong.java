
import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int num;
		System.out.println("\n Enter the no.");
		Scanner  sc= new Scanner(System.in);
		num= sc.nextInt();
		int l=armstrongno(num);
		if(l!=0)
			System.out.println(" The number is Armstrong  "  +num);
		else
			System.out.println(" The number is not Armstrong " +num);
	}
	static int armstrongno(int  num1) 
	{
		int num2,p,sum=0;
		num2=num1;
		while(num2>0)
		{
			p=(num2)%10;
			num2=num2/10;
			sum=sum+(p*p*p);
		}
		if (sum==num1)
			return 1;

		else

			return 0;
	}

}

