import java.util.Scanner;

public class AvgOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many num you want to enter");
		int num=sc.nextInt();
		int ar[]=new int[num];
		int sum=0;
		System.out.println("Enter"+num+" values");
		for (int i = 0; i < ar.length; i++)
		{
			ar[i]=sc.nextInt();
		}
		double avg=0.0;
		for (int i = 0; i < ar.length; i++) 
		{
			sum=sum+ar[i];
			 avg=sum/(double)num;
		}
		System.out.println("The Av of numbers="+avg);
	}
}