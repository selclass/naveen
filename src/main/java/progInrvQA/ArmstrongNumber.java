package progInrvQA;

public class ArmstrongNumber {
	
	public static boolean numTest(int num) {
	
		int cube =0;
		int rem;
		int tem;
		
		tem=num;
		
		while(num>0) { // 153>0; 15>0; 1>0; 0>0;
			rem = num%10; // 153%10=3;  15%10=5; 1%10=1; 0%10=0
			num = num/10; // 153/10=15; 15/10=1; 1/10=0; 0/10=0
			cube = cube+(rem*rem*rem); // 3*3*3=27; 5*5*5=125; 1*1*1=1		
		}
		
		if(tem==cube) {
			System.out.println("it Amstronge");
			return true;
		} else
			//System.out.println("its not Amstronge");
		return false;		
	}
	
	public static void numRange(int num) {
		for(int i=0; i<=num; i++) {
			if(numTest(i)) 
				System.out.println(i+" ");
		}
	}
	
	public static void main(String[] args) {
		numRange(500);
	}
}
