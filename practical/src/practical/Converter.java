
//program for convert ruppes into dolar.
//Developer:Naitik_prajapati(151040107042)
//Date-10th july,2017(Monday)

//1 US Dollar=64.47 INR on Date 10th July,2017(source-google.co.in).
//1 USD = 100 Cents.
package practical;

import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		
		float rate=(float)64.47;
		
		System.out.println("Enter Rupees=");
		Scanner s=new Scanner(System.in);
	
        int rupees=s.nextInt();					//create object of Scanner              class.
		int dollar=(int)((int)rupees/rate);     //calculate dollar using this formula.
		
        float cent=(rupees - (dollar*rate) )* (100/rate);	//calculate cent using this formula.
		
		System.out.println("Dollar="+dollar);
		System.out.println("Cent="+cent);
		
		s.close();	}

}

