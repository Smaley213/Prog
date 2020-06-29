package by.htp.less.tictac;

public class Main {

	public static void main(String[] args) {
		
		Counter count = new Counter(0, 24, 0);
		
		int val = count.increaseValue();
		
		System.out.println(val);
		
		val = count.decreaseValue();
		
		System.out.println(val);
	}

}
