import java.util.Scanner;

public class ConbineArray {
	int [] readArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many num you want to enter");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" values");
		for (int i = 0; i < ar.length; i++) 
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	void  dispArray(int ar[])
	{
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]+" ");
		}
		System.out.println();
	}
	int [] mergeArray(int x[],int y[])
	{
		int z[]=new int[x.length+y.length];
		for (int i = 0; i < x.length; i++) {
			if(i%2==0)
				z[i]=x[i];
			else
				for (int j = 0; j < y.length; j++) {
					z[i]=y[i];
				}
		}
		for (int i = 0; i < y.length; i++) {
			z[x.length+i]=y[i];
		}
		return z;
	}
}
