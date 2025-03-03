package Lesson33H;

public class TryMultiCatch {
	public static void main(String[] args) {
		try {
			int number = 10 / 0;
			String text = null;
			System.out.println(text.length());
			int[] numbers = {1,2,3};
			System.out.println(numbers[3]);
		} catch (ArithmeticException a) {
			System.out.println("Ошибка, на ноль делить нельзя!");
		} catch (IndexOutOfBoundsException i) {
			System.out.println("Ошибка, выход за пределы массива!");
		} catch (NullPointerException n) {
			System.out.println("Ошибка, обращение на null Обьекту!");
		}
	}
}
