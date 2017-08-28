package practical;

import java.util.Scanner;

public class PalindromeExample {

	private static Scanner sc;
	public static void main(String[] args) {
		String str="";
		System.out.println("Enter the Statement :-");
		sc = new Scanner(System.in);
		str=sc.nextLine();
		
		String s=new StringBuffer(str).reverse().toString();
		if(str.equals(s))
		{
			System.out.println("String "+str+" is Palindrome");
		}
		else
		{
			System.out.println("String "+str+" is Not a Palindrome");
		}
		


	}

}
