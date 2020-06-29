package by.htp.less.test1;

public class Main {
	
	public static void main(String[] args) {
       
		int sum;
		int max;
		
        Test1 test = new Test1();

       test.setX(3);
		test.setY(4);
		
		test.print();
		
		sum = test.sumXY();
		max = test.maxXY();
		
		System.out.println("Сумма х и у равна " + sum + ", наибольшее значение равно " + max);

	}

}
