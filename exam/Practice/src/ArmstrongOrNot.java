import java.util.Scanner;

public class ArmstrongOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num>0)
		{
			int r=num%10;
			int cube=r*r*r;
			sum=sum+cube;
			num=num/10;
		}
		num=temp;
		if(num==sum)
			System.out.println(+num+" is a Armstrong number");
		else
			System.out.println(+num+" is not aArmstrong Number");
		
	}
}
