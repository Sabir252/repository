package Lesson32H;

public class ExceptionIndexOutOfBoundsException {
	public static void main(String[] args) {
		try {
			int[] numbers = {1,2,3,4};
			System.out.println(numbers[10]);
		} catch (IndexOutOfBoundsException i) {
			System.out.println("Ошибка, выход за пределы массива.");
		}
	}
}
