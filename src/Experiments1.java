
public class Experiments1 {
	static void garg() {
		System.out.println("garg");

	}

	void garg1() {
		System.out.println("garg1");
	}

	public static void main(String[] args) {
		Experiments1.garg();
		garg();
		Experiments1 experiments1 = new Experiments1();
		experiments1.garg1();
	}

}
