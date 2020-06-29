package by.htp.less.tictac;

public class Counter {

	private int min;
	private int max;
	private int value;
	
	Counter(int min, int max, int value){
		this.min = min;
		this.max = max;
		this.value = value;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int increaseValue() {
		if ((min >= 1) && (max <= 24)) {
			value++;
			System.out.println(value);
		}
		return value;
	}
	public int decreaseValue() {
		if ((min >= 1) && (max <= 24)) {
			value--;
			System.out.println(value);
		}
		return value;
	}

}
