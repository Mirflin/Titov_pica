package Functions;

import java.util.ArrayList;
import java.util.List;

import Frames.startingFrame;

public class pizzeria {
	public static ArrayList<Object> checkouts = new ArrayList<>();
	public static List<Boolean> pizza_param = new ArrayList<>();
	public static Boolean[] testing = new Boolean[9];
	
	public static void main(String[] args) {
		pizza da = new pizza("40","top1","top2","top3","sauce",10);
		pizza net = new pizza("30","top12","top23","top34","sauce",10);
		checkouts.add(da);
		checkouts.add(net);
		for(int i = 0; i <= 6;i++) {
			pizza_param.add(false);
		}
		startingFrame start = new startingFrame();
		start.setVisible(true);
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
