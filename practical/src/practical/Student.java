//Program to perform Add the marks of six(6) subject and find the percentage.
//Developer:Naitik_prajapati(151040107042)
//Date-10th july,2017(Monday)

package practical;
import java.util.Scanner;
public class Student {
 static int[] a=new int[6];
	 static int sum=0;
	 
	public static void main(String[] args) {
		
	Scanner s=new  Scanner(System.in);
	System.out.println("Enter 6 subject marks=");
	for(int i=0;i<6;i++)					//Enter 6 subject marks.
	{	
		System.out.println("Enter subject Marks "+(i+1));
		a[i]=s.nextInt();					
		sum+=a[i];
	}
	//To find the percentage using this formula.
	float p=sum/6;							
	System.out.println("Percentage="+p);
	s.close();
	}
}
