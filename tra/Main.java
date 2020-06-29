package by.htp.less.tra;

public class Main {

	public static void main(String[] args) {
		int size;
		size = 5;

		Trains[] trains = new Trains[size];

		trains[0] = new Trains("Minsk", 24, "17:50");
		trains[1] = new Trains("Moskva", 11, "12:30");
		trains[2] = new Trains("Gomel", 145, "8:45");
		trains[3] = new Trains("Minsk", 234, "10:24");
		trains[4] = new Trains("Minsk", 173, "06:50");
		
		Logic logic = new Logic();
		View view = new View();
		

		trains = logic.sortTrainByNumber(trains);

		view.printTable(trains);

		System.out.println();

		view.findTrainByNumber(254, trains);

		System.out.println();

		logic.sortTrainByDestination(trains);

		view.printTable(trains);

	}

}
