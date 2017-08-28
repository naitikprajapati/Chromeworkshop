//Write a program to find length of string and print second half of the string.
//Developer-Naitik_prajapati(151040107042).
//Date-5th August,2017.

package practical;
import java.util.Scanner;


public class SubstringExample {

	private static Scanner sc;
	public static void main(String[] args) {
		String str="";
		System.out.println("Enter String:");
		sc = new Scanner(System.in);
		str=sc.nextLine();
		int length=str.length();
		System.out.println("Length of "+str+" : "+length);
		System.out.println("First half of "+str+" : "+str.substring(0, length/2));
		System.out.println("Second half of "+str+" : "+str.substring(length/2));
		

	}

}
