package Functions;

import java.util.ArrayList;
import java.util.List;

import Frames.startingFrame;

public class pizzeria {
	public static ArrayList<Object> checkouts = new ArrayList<>();
	public static List<Boolean> pizza_param = new ArrayList<>();
	public static Boolean[] testing = new Boolean[9];

	
	public static void main(String[] args) {
		
	}
	
	public static ArrayList<Object> getArray(){
		return checkouts;
	}
	
	public static void setArray(ArrayList<Object> arr){
		checkouts = arr;
	}
	
	public static List<Boolean> getList(){
		return pizza_param;
	}
	
	public static void setList(List<Boolean> list){
		pizza_param = list;
	}

}
