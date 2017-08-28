//Write an interactive program to print a diamond shape. For example, if user enters the number 3, the diamond will be as follows:
/*
   * 
 * * 
* * * 
 * * 
  * 		*/
//Developer-Naitik_Prajapati(151040107042)
//Date-14th August,2017.


package practical;

import java.util.Scanner;		//Import Scanner class.

public class DiamondPatternExample {

	public static void main(String[] args) {
		int n,i,j,k;
		System.out.println("Enter the No. =");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();		//How many no. of maximum * print in one line.
		
		for(i=0;i<n;i++)	//loop for above part of diamond-no. of rows=n
		{
			for(j=n-1;j>i;j--)		//loop for printing blank-space.
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)		//loop for printing *.
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		for(i=0;i<n-1;i++)	//loop for below part of diamond-no. of rows=n-1.
		{
			for(j=0;j<=i;j++)		//loop for printing blank space.
			{
				System.out.print(" ");
			}
			for(k=n-1;k>i;k--)		//loop for printing *.
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
