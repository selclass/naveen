package progInrvQA;

public class Test {
    public static boolean isPalandrom(int num) {
        
        int rem = 0;
        int sum = 0;
        int tem;
        
        tem = num;
        
        while(num>0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        if(tem == sum){        	
            return true;
           
        } else 
            return false;
    } 
    
    public static void palandromRange(int num) {
        for (int i=0; i<=num; i++) {
         if(isPalandrom(i))
         System.out.print(i +" ");
        }
    }
    
    public static void main(String[] args ) {
    	palandromRange(300);
    }
}