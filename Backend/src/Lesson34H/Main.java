package Lesson34H;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("Моя ошибка");
		} catch (MyException m) {
			System.out.println(m.getMessage());
		}
	}

	public static void riskyMethod() throws NullPointerException{};
}
