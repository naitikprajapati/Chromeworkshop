package practical;

public class Prime {
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=2;i<=1000;i++)
		{
			int c=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)	
					c++;
			}
			if(c==0){
				System.out.println(i);
				count++;}
			
		}
		System.out.println("NO. of Prime Number Between 2-1000="+count);

	}

}
