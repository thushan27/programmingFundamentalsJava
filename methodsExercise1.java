package demo;

public class methodsExercise1 {

	public static int sumOfNumbers(int n) {

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String args[]) {

		System.out.println(sumOfNumbers(10));

	}
}
