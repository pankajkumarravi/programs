package BiggestElementFromMat;

import java.util.Scanner;

public class BiggestElement {

	int[][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows and colums: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0;i<mat.length;i++)
		{
			System.out.println("Enter "+i+1+ " rows " +mat[i].length+" elements :");
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	void displayMat(int mat[][]){
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	int getBiggest(int ar[][])
	{
		int big=ar[0][0];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				big=ar[i][j];
			}
		}
		return big;
	}

}

