package by.htp.less.tra;

public class View {
	
	public void findTrainByNumber(int numberOfTrain, Trains[] trains) {

		for (int i = 0; i < trains.length; i++) {

			if (trains[i].getNumberOfTrain() == numberOfTrain) {

				System.out.println(trains[i].getDestination() + " " + trains[i].getNumberOfTrain() + " "
						+ trains[i].getDepartureTime());

			}
		}
	}
	
	public void printTable(Trains[] trains) {

		for (int i = 0; i < trains.length; i++) {

			System.out.println(trains[i].getDestination() + " " + trains[i].getNumberOfTrain() + " "
					+ trains[i].getDepartureTime());
		}
	}


}
