package Lesson35H;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triple<String, Double, Integer> triple = new Triple<String, Double, Integer>("Sabir", 10.5, 10);
		System.out.println(triple.getFirst());
		System.out.println(triple.getSecond());
		System.out.println(triple.getThird());
	}

}
