package progInrvQA;

public class Factorial {

	static int getFactRecr(int num) {

		if (num != 0) {
			return num * getFactRecr(num - 1);
		} else {
			return 1;
		}
	}

	static void getFactLoop(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		getFactLoop(3);
		System.out.println(getFactRecr(3));
	}
}
