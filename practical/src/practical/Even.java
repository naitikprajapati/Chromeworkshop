package practical;

public class Even {

	public static void main(String[] args) {
		int count=0;
		for(int i=0;i<=100;i++){
			if(i%2==0){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("No. of Even Number Between 1-100="+count);

	}

}
