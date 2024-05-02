package Functions;

import java.util.ArrayList;

import Frames.startingFrame;

public class pizzeria {
	public static ArrayList<Object> checkouts = new ArrayList<>();
	public static void main(String[] args) {
		
		pizza test = new pizza(30, "top1", "top2", "top3", "ketch", 10,"re");
		test.getName();
		startingFrame start = new startingFrame();
		start.setVisible(true);
	}
	
	public static ArrayList<Object> getArray(){
		return checkouts;
	}

}
