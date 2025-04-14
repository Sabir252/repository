package Lesson43H;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread splash = new Thread(() -> {
			System.out.println("пылесосить");
		});
		
		Thread text2 = new Thread(() -> {
			System.out.println("Мыть окна");
		});
		
		Thread text3 = new Thread(() -> {
			System.out.println("Выкинуть мусор");
		});
		
		splash.setPriority(Thread.MIN_PRIORITY);
		text3.setPriority(Thread.MAX_PRIORITY);
		splash.start();
		text2.start();
		text3.start();
	}

}
