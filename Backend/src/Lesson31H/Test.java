package Lesson31H;

public class Test {
public static void main(String[] args) {
	Animal animal = new Animal() {
		
		@Override
		public void sound() {
			System.out.println("Hello");
			
		}
	};
	animal.sound();
}
}
