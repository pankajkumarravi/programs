import java.util.Scanner;

public class ReadnNNumberCountHouwManyDivBy5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many num you want to enter:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n +" values");
		for (int i = 0; i < n; i++) {
			ar[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("Num divisible by 5 are");
		for (int i = 0; i < n; i++) {
			if(ar[i]%5==0)
			{
				System.out.println(ar[i]);
				count++;
			}
		}
		System.out.print("Num div by 5 count="+count);
	}
}
