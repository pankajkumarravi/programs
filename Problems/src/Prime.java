import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,p;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n:");
		n=s.nextInt();
		System.out.println("Prime numbers upto "+n+" are:");
		for(int i=2;i<n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					p=1;
			}
			if(p==0)
				System.out.println(i);
		}
	}
}
