package Lesson31H;

public class Penguin extends Bird{
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Penquins can't fly");
	}
}
