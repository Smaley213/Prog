package by.htp.less.Cust;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String address;
	private int numberOfCard;
	private int bankAccountNumber;

	public Customer() {

	}

	public Customer(int id, String surname, String name, String address, int numberOfCard, int bankAccountNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.address = address;
		this.numberOfCard = numberOfCard;
		this.bankAccountNumber = bankAccountNumber;

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfCard() {
		return numberOfCard;
	}

	public void setNumberOfCard(int numberOfCard) {
		this.numberOfCard = numberOfCard;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String toString() {
		return String.format("ID: %d\t surname: %s\t name: %s\t from: %s\t credit card %d\t bank number %d", id,
				surname, name, address, numberOfCard, bankAccountNumber);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bankAccountNumber;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfCard;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNumber != other.bankAccountNumber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfCard != other.numberOfCard)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

}
