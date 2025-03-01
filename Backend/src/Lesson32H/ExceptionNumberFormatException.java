package Lesson32H;

public class ExceptionNumberFormatException {
	public static void main(String[] args) {
		try {
			String text = "Sabir";
			int number = Integer.parseInt(text);
			System.out.println(number);
		} catch (NumberFormatException n) {
			System.out.println("Ошибка, преоброзование строки в число.");
		}
		
		try {
			int number = 10 / 0;
		} catch (Exception e) {
			System.out.println("jnjn");
		}
	}
}
