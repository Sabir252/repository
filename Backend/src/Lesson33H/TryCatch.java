package Lesson33H;


public class TryCatch {
	public static void main(String[] args) {
        checkAge(16);
        checkAge(20);
    }
	
    public static void checkAge(int a) {
        try {
            if (a < 18) {
                throw new IllegalArgumentException("Число должен быть больше 0");
            }
            System.out.println("Доступ разрешен");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

