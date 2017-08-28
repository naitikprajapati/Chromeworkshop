//Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. The program should continue till user enters a word “quit”. Display the total count of each vowel for all sentences.
//Developer-Naitik_prajapati(151040107042)
//Date-14th August,2017.

package practical;

import java.util.Scanner;		//import the Scanner class.

class CountVowel				//class CountVowel.
{
	private int i,counterVowel=0;		//private Data-member.
	String str="";						//initially String Refrence str is point to Null.
	String Vowels="AEIOUaeiou";			//String object Vowels.
	private Scanner sc=new Scanner(System.in);	//Create object of Scanner class.
	void read()							//read() method of class CountVowel.
	{
		
		System.out.println("Enter the String : ");
		str=sc.nextLine();				//Enter the string.
		
	}
	void Count()		//Count Vowels in Statment.
	{
		while(!str.equalsIgnoreCase("quit"))		//continue until string not match with "quit".
		{
			for(i=0;i<str.length();i++)				
			{
				char ch=str.charAt(i);
				if(Vowels.indexOf(ch)!=-1)			//check for vowels.
				{
					counterVowel++;
				}
				
			}
			
			//Read the next string from user.
			read();
	
		}
	}
	
	int GetcounterVowel()
	{
		return counterVowel;		//Get value of counterVowel.
	}
	
}
public class CountVoweltest {

	public static void main(String[] args) {
		
		CountVowel cvowel=new CountVowel();	//create object of CountVowel class.
		cvowel.read();						//call the read() method of CounterVowel class.
		cvowel.Count();						//call the Count() method of CountVowel class.
		//call the GetcounterVowel() to get no. of Vowels in all statement.
		System.out.println("No. of Vowels in Statements="+cvowel.GetcounterVowel());

	}

}
