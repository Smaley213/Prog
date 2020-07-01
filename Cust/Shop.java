package by.htp.less.Cust;

import java.util.ArrayList;

public class Shop {

	private String shopName;

	public ArrayList<Customer> customersList = new ArrayList<>();

	public Shop(String shopName) {
		this.setShopName(shopName);
	}

	public void addCustomerToShopList(Customer customer) {
		customersList.add(customer);
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public ArrayList<Customer> getCustomersList() {
		return customersList;
	}

	public void setCustomersList(ArrayList<Customer> customersList) {
		this.customersList = customersList;
	}


}
