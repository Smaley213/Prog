package by.htp.less.time;

public class Main {

public static void main(String[] args) {
		
		Clock clock1 = new Clock(12, 12, 03);
		Logic logic = new Logic();
		View view = new View();
		
		view.printTime(clock1);
		
		logic.changeHours(clock1, 15);
		logic.changeMin(clock1, 40);
		logic.changeSec(clock1, 55);
		
		view.printTime(clock1);
		
		

	}

}
