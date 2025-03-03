package Lesson33H;

import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			int number = 10 / 2;
		} catch (ArithmeticException e) {
			System.out.println("Ошибка, на ноль делить нельзя!");
		} finally {
			System.out.println("У вас есть ошибок?");
		}
		
		Scanner inpuScanner = new Scanner(System.in);
		String text = inpuScanner.nextLine();
	}
}
