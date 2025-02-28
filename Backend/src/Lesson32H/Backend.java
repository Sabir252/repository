package Lesson32H;

import java.util.Scanner;

public class Backend {
public static void main(String[] args) {
	try {
		Scanner inputScanner = new Scanner(System.in);
		int number1 = inputScanner.nextInt();
		int number2 = inputScanner.nextInt();
		if (number2 > 0) {
			System.out.println("Всё правильно");
		}
	} catch (Exception e) {
		System.out.println("Ошибка");
	}
}
}
