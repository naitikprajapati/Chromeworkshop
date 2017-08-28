//Write an interactive program to print a string entered in a pyramid form. For instance, the string “stream” has to be displayed as follows:
/*    S 
     S t 
    S t r 
   S t r e 
  S t r e a 
 S t r e a m  */
//Developer-Naitik_Prajapati(151040107042).
//Date-14th August,2017.

package practical;

import java.util.Scanner;

public class PyramidstreamExample {

	public static void main(String[] args) {
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter String :");
		str=sc.nextLine();
		
		for(i=0;i<str.length();i++)
		{
			for(j=str.length();j>i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				char ch=str.charAt(k);
				System.out.print(ch+" ");
			}
			System.out.println();
		
		}
		sc.close();
	}

}
