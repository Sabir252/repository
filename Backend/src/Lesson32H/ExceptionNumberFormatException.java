package Lesson32H;

public class ExceptionNumberFormatException {
	public static void main(String[] args) {
		try {
			String text = "Sabir";
			int number = Integer.parseInt(text);
			System.out.println(number);
		} catch (Exception e) {
			System.out.println("Ошибка, преоброзование строки в число.		");
		}
	}
}
