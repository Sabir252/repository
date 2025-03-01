package Lesson32H;

public class ExceptionIndexOutOfBoundsException {
	public static void main(String[] args) {
		try {
			int[] numbers = {1,2,3,4};
			System.out.println(numbers[10]);
		} catch (IndexOutOfBoundsException i) {
			System.err.println("Ошибка, выход за пределы массива.");
		}
		
		try {
			try {
				int n = 10/0;
			} catch (Exception e) {
				System.out.println("jbhhb");
			}
			int[] numbers = new int [10];
			numbers[20] = 5;
		} catch (Exception e) {
			
		}
	}
}
