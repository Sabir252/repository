package Lesson43H;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread buy = new Thread(()-> {
			System.out.println("Покупаю билет");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		});
		
		Thread buyPopcorn = new Thread(()-> {
			try {
				buy.join();
				System.out.println("Покупаю попкорн");
				Thread.sleep(2500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		});
		
		Thread with = new Thread(() -> {
			try {
				buyPopcorn.join();
				System.out.println("Смотрю кино");
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		});
		
		buy.start();
		buyPopcorn.start();
		with.start();
	}

}
