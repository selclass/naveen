package progInrvQA;

public class PalandromNumber {

	public static void isPalndrom(int num) {

		int rem = 0;
		int sum = 0;
		int temp; 

		temp = num;

		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("its palandrom");
		} else {
			System.out.println("its not palandrom");
		}
	}

	public static void main(String args[]) {
		isPalndrom(151);
	}
}
