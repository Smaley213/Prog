package by.htp.less.Cust;


//  ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������ � 
//  �����  toString().  ������� ������ �����, ������������ ������ ����  Customer, � ����������� �������������� � 
//  ��������. ������ �������� ������ ������ � ������� ��� ������ �� �������.  

//  ����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.

//    ����� � �������:  
// a) ������ ����������� � ���������� �������;  
// b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ��������� 

import java.util.List;

public class Main {

	public static void main(String[] args) { 
		
		Shop supermarket = new Shop("Supermarket");
		Logic logic = new Logic();
		View view = new View();

		supermarket.addCustomerToShopList(new Customer(0, "������", "����", "�������", 34_27_83_54, 92111));
		supermarket.addCustomerToShopList(new Customer(1, "������", "����", "�������", 20_30_94_75, 83455));
		supermarket.addCustomerToShopList(new Customer(2, "�������", "�������", "�������", 36_67_55_36, 54569));
		supermarket.addCustomerToShopList(new Customer(3, "�������", "������", "�������", 24_35_56_97, 75674));
		supermarket.addCustomerToShopList(new Customer(4, "���������", "����", "��������", 25_16_75_88, 16783));
		supermarket.addCustomerToShopList(new Customer(5, "�������", "�����", "�������", 67_97_18_39, 37891));

		view.view(supermarket.customersList);

		   System.out.println("\n���������� �� �������:");

		List<Customer> listSortByName = logic.getListBySurname(supermarket.customersList);
		
		view.view(listSortByName);

		   System.out.println("\n���������� �� ������ ����� � �������� ���������:");

		List<Customer> listSortByDiapazonCreditCard = logic.getListByBankAccountNumber(supermarket.customersList, 33_44_55_66, 66_77_88_99);
		
		view.view(listSortByDiapazonCreditCard);
		
	}

}
