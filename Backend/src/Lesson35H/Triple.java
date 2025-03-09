package Lesson35H;

public class Triple<T, U, V> {
	private T item1;
	private U item2;
	private V item3;
	
	public Triple(T item1, U item2, V item3) {
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
	}
	
	public void setFirst(T item1) {
		this.item1 = item1;
	}
	
	public T getFirst() {
		return item1;
	}
	
	public void setsSecond(U item2) {
		this.item2 = item2;
	}
	
	public U getSecond() {
		return item2;
	}
	
	public void setThird(V item3) {
		this.item3 = item3;
	}
	
	public V getThird() {
		return item3;
	}
}
