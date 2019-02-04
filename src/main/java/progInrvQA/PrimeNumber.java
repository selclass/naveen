package progInrvQA;
/* Comment
	the number which can be divided by its own number only not with any other number.
	3 can be 3/3=0 we cannot get the 0 as reminder, its completely divided.*/
public class PrimeNumber {
/*Comment
 * 2 is the lowest prime number. 	
 */
public static boolean isPrimeNumber(int testNumber) {
	
/* Comment
 if the number is less than 1 then ill return false.
 because 1 and 0 is not prime number */  		
 
		if(testNumber<=1) {
			return false ;
		}
		for(int i=2; i<testNumber; i++) {
			if(testNumber % i == 0) {				
				return false ;				
			}
		}
		return true;				
	}

public static void getPrimeNum(int testNumber) {
	for(int i=2; i<=testNumber; i++) {
		if(isPrimeNumber(i)) 
			System.out.print(i);		
	}	
}
	
public static void main(String[] args) {
	System.out.println(isPrimeNumber(7));	
	getPrimeNum(20);	
	}
}
