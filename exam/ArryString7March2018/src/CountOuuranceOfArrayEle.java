
public class CountOuuranceOfArrayEle {

	public static void main(String[] args) {
		int ar[]={23,45,56,23,56,78,56,12};
		int n=ar.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(ar[i]==ar[j])
				{
					ar[j]=ar[n-1];
					n--;
					j++;
					count++;
				}
			}
			System.out.println(ar[i]+" occured "+count+" times");
		}

	}

}
