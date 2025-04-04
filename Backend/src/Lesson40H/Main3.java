package Lesson40H;

import java.util.function.Consumer;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> text = s -> System.out.println(s.toUpperCase());
		text.accept("hello");
	}

}
