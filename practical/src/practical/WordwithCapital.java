package practical;
import java.util.Scanner;
public class WordwithCapital {

	private static Scanner sc;

	public static void main(String[] args) {
		String str="";
		int i,counterWord=0;
		System.out.println("Enter the Statement :-");
		sc = new Scanner(System.in);
		str=sc.nextLine();
		
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				counterWord++;
			}
			while(i<str.length() && str.charAt(i)!=' ')
			{
				i++;
			}
		}
		System.out.println("Number of Words Start with Capital letter="+counterWord);
	}

}
