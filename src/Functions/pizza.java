package Functions;

public abstract class pizza {
	int diametrs;
	String toping1;
	String toping2;
	String toping3;
	String sauce;
	int cena = 0;
	pizza(int diametrs,String toping1,String toping2,String toping3,String sauce,int cena){
		this.diametrs = diametrs;
		this.toping1 = toping1;
		this.toping2 = toping2;
		this.toping3 = toping3;
		this.sauce = sauce;
		this.cena = cena;
	}
	void set_cena(int cena) {
		this.cena = cena;
	}
	void set_diametrs(int diametrs) {
		if(diametrs > 20 || diametrs < 50) {
			this.diametrs = diametrs;
		}else {
			System.out.println("Nepareiz diametrs!");
		}
	}
	void set_sauce(String sauce) {
		this.sauce = sauce;
	}
	void set_toping(String toping,int number) {
		if(number == 1) {
			toping1 = toping;
		}else if(number == 2) {
			toping2 = toping;
		}else {
			toping3 = toping;
		}
	}
	String checkout() {
		java.util.Date date = new java.util.Date();
		String checkout = "Date: "+date+"\n ---------------------\n Diametr: "+diametrs+"\nToppings: \n "+toping1+"\n"+ toping2+"\n"+ toping3+"\n---------------------\n"+ "Checkout: "+cena;
		return checkout;
	}
	

}
