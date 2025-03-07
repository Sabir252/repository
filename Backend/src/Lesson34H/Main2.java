package Lesson34H;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserService();

		try {
			userService.findUser("admin");
		} catch (UserNotFoundException e) {
			System.out.println("Ошибка: " + e.getMessage());
		}
	}

}
