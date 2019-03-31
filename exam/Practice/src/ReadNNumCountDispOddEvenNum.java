import java.util.Scanner;
public class ReadNNumCountDispOddEvenNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many num u want to Enter");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter all "+n+ " Values");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int ecount=0,ocount=0;
		System.out.println("Even numbers are:");
		for (int i = 0; i < n; i++) 
		{
			if(ar[i]%2==0){
				System.out.println(ar[i]);
				ecount++;
			}
		}
		System.out.println("Odd numbers are");
		for(int i=0;i<n;i++)
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]);
				ocount++;
			}
		}
		System.out.println("Even count="+ecount);
		System.out.println("Odd count="+ocount);
	}
}
