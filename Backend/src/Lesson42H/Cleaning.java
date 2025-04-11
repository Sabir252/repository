package Lesson42H;

public class Cleaning extends Thread{
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("Мелейке убирается в комнате");
			try {
				Thread.sleep(800);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
