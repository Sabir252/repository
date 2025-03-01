package Lesson32H;

public class ExceptionNullPointerException {
	public static void main(String[] args) {
		try {
			String text = null;
			System.out.println(text.length());
		} catch (NullPointerException n) {
			System.err.println("Ошибка, обращение на null Обьекту.");
		}
	}
}
