package Lesson34H;

public class UserService {
	public void findUser(String username) throws UserNotFoundException {
		if (!"admin".equals(username)) {
			throw new UserNotFoundException("Пользователь с именем " + username + " не найден.");
		}
		System.out.println("Пользователь " + username + " найден.");
	}
}
