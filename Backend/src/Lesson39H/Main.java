package Lesson39H;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String[] input =  {"Nurxan", "Umud", "Emil"};
		List<String> text = new ArrayList<>(Arrays.asList(input));
		System.out.println(text);
	}
}
