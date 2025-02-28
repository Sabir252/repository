package Lesson32H;

public class ExceptionArithmeticException {
	public static void main(String[] args) {
		try {
			int a = 30;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException a) {
			System.out.println("Ошибка, на ноль делить нельзя!");
		}
	}
}
