package Lesson42H;

import Lesson42.Drive;
import Lesson42.Music;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cleaning cleaning = new Cleaning();
		cleaning.start();
		
		Thread eating = new Thread(new Eating());
		eating.start();
		
		Thread podcast = new Thread(new Podcast());
		podcast.start();
	}

}
