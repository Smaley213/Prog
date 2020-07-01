package by.htp.less.Cust;

import java.util.ArrayList;
import java.util.List;

public class View {
	
	public void view(List<Customer> customersList) {
		for (Customer c : customersList) {
			System.out.println(c);
		}
	}

	
}
