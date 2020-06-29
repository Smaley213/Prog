package by.htp.less.tra;

public class Trains {

	private String destination;
	private int numberOfTrain;
	private String departureTime;
	
	public Trains() {
		
	}
	
	public Trains(String destination, int numberOfTrain, String departureTime) {
		
		this.destination = destination;
		this.numberOfTrain = numberOfTrain;
		this.departureTime = departureTime;
		
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumberOfTrain() {
		return numberOfTrain;
	}
	public void setNumberOfTrain(int numberOfTrain) {
		this.numberOfTrain = numberOfTrain;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numberOfTrain;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trains other = (Trains) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numberOfTrain != other.numberOfTrain)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", numberOfTrain=" + numberOfTrain + ", departureTime="
				+ departureTime + "]";
	}

}
