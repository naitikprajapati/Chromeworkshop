//Program to perform Arithmatic operation on two operand.
//Developer:Naitik_prajapati(151040107042)
//Date-10th july,2017(Monday)

package practical;
import java.util.Scanner;

public class Operation {

private static Scanner s;

public static void main(String[] args) {
	int choice;
do{
					
System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-exit\n");

s = new Scanner(System.in);
System.out.println("Enter choice=");
choice=s.nextInt();				//Input the choice through I/O devices.
					
System.out.println("Enter number 1=");
int a=s.nextInt();						//Enter value of Operand 1.	

System.out.println("Enter number 2=");
int b=s.nextInt();						//Enter value of Operand 2.
		
switch(choice)
	{
			case 1: System.out.println("Addition="+(a+b));
				break;
									
			case 2: System.out.println("Subtraction="+(a-b));
				break;
									
			case 3: System.out.println("Multiplication="+(a*b));
				break;
				
case 4: if(b!=0)
					System.out.println("Subtraction="+(a/b));
				else
					System.out.println("Enter Proper value of b.");
				break;
									
			case 5:
				break;
									
			default:
				System.out.println("Enter choice between 1-5.");

			}
			//s.close();
			
		}while(choice!=5);		
	}
}
