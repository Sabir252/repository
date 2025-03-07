package Lesson35;

import java.security.cert.X509Certificate;

public class Box<X, U> {
	private X item;

	private U item2;

	public Box(X item, U item2) {
		this.item = item;
		this.item2 = item2;
	}

	public void setItem(X item) {
		this.item = item;
	}

	public void setItem2(U item2) {
		this.item2 = item2;
	}

	public X getItem() {
		return item;
	}

	public U getItem2() {
		return item2;
	}
}
