package garbagecollection;

public class Account {

	public static void main(String[] args) {
		Account x = new Account();
		Account y = new Account();

		x = new Account();
		y = x;

		x = null;
		y = null;
		
		System.gc();
	}

}
