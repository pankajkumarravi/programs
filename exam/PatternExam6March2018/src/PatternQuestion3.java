
public class PatternQuestion3 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j);
				if(j>0&&j!=i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
