import java.util.Scanner;

public class DispNegAndPositiveValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many nu you want to enter ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter all "+n+" values");
		for (int i = 0; i <n; i++)
		{
			ar[i]=sc.nextInt();	
		}
		System.out.println("Negative numbers are:");
		for(int i=0;i<n;i++)
		{
			if(ar[i]<0){
				System.out.println(ar[i]);
			}
		}
		System.out.println("Positive numbers are:");
		for (int i = 0; i < n; i++) {
			if(ar[i]>0)
			{
				System.out.println(ar[i]);
			}
		}
	}
}
