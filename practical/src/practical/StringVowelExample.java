//Write a program to accept a line and check how many consonants and vowels are there in line.
//Developer-Naitik_prajapati(151040107042).
//Date:5th August,2017.

package practical;
import java.util.Scanner;
public class StringVowelExample {
	
	private static Scanner sc;
	public static void main(String[] args) {
		String str="";
		String vowel="AEIOUaeiou";
		String Digit="0123456789";
		String Symbol="!@#$%^&*_+/><";
		int i,count_vowel=0,count_consonants=0;
		
		System.out.println("Enter String:");
		sc = new Scanner(System.in);
		str=sc.nextLine();
		int length=str.length();
		System.out.println("Length of "+str+" : "+length);
		
		for(i=0;i<length;i++)
		{
			char ch=str.charAt(i);
			if(vowel.indexOf(ch)>=0)
				count_vowel++;
			else if(Digit.indexOf(ch)>=0) {}
				
			else if(Symbol.indexOf(ch)>=0) {}
				
			else if(ch!=' ')
				count_consonants++;
			
		}
		System.out.println("No. of Vowels in "+str+"="+count_vowel);
		System.out.println("No. of Consonants in "+str+"="+count_consonants);
	}

}
