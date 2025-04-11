package Lesson42H;

public class Podcast implements Runnable{
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Мелейке cлушает подкаст");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
