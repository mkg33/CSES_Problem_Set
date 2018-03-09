import java.util.Scanner;


public class Missing_number2 {
	
	static long[] numbers;
	
	static long missing;
	
	static long counter = 0;
	
	static long expected = 0;

public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		
		int total_length = console.nextInt();
		
		numbers = new long[total_length];
		
		
		 for(int j=1; j<total_length; j++){
		  numbers[j] = console.nextInt();
		 }
		 
		 for(int i=1; i<numbers.length; i++){
			 
			 counter += numbers[i];
			 
		 }
		 
		 for(int j=1; j<=total_length; j++){
			 
			 expected += j;
			 
		 }
		 
		 missing = expected-counter;
		 
		 System.out.println(missing);

		 console.close();
}

}