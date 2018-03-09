import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.LongStream;


public class Missing_number {
	
	static long[] numbers;
	
	static long missing;
	
	static long k;
	
	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		
		int total_length = console.nextInt();
		
		if(total_length<2 || total_length>500000){
			
			console.close();
			System.exit(0);
		}
		
		numbers = new long[total_length];
		
	
		
		 for(int j=1; j<total_length; j++){
		  numbers[j] = console.nextInt();
		 }
		
	
		Arrays.sort(numbers);
		
		
		
		for(k=1; k<=total_length; k++){
			
			
			if(!LongStream.of(numbers).anyMatch(x-> x == k)){
				
				missing = k;
				break;
				
			}
			
			else{
				
				missing = total_length;
				
			}
			
		}
	
		
		System.out.println(missing);
		
		
		
		console.close();
		
		
		
	}

}
