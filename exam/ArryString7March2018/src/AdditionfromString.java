import java.util.Scanner;

public class AdditionfromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		System.out.println();
	}
	private static int sumOfDigits(String s) {
		int sum=0;
		char ch[]=s.toCharArray();
		int no=0;
		for(int i=0;i<ch.length;i++){
			while(i<ch.length&&ch[i]>='0'&&ch[i]<='9'){
				no=no*10+(ch[i]-48);
				i++;
			}
			sum=sum+no;
			System.out.println(sum);
		}
		return sum;

	}
}
