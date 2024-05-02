package Functions;

import java.util.ArrayList;

import Frames.startingFrame;

public class pizzeria {
	public static ArrayList<Object> checkouts = new ArrayList<>();
	public static void main(String[] args) {
		startingFrame start = new startingFrame();
		start.setVisible(true);
	}
	
	public static ArrayList<Object> getArray(){
		return checkouts;
	}
	
	public static void setArray(ArrayList<Object> arr){
		checkouts = arr;
	}

}
