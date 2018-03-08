
import java.util.Scanner;

public class Weird_Algorithm {
	
	
	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		
		long n = console.nextInt();
		
		System.out.print(n+" ");
		
		while(n!=1){
			
			
			if(n%2==0){
				
				n = n/2;}
			
				else{
					
					n = 3*n + 1;
					
				}
			System.out.print(n+" ");
			
			}
	}
		}
		
	


