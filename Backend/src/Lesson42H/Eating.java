package Lesson42H;

public class Eating implements Runnable{
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Мелейке завтракает");
			try {
				Thread.sleep(900);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
