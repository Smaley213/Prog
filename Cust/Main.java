package by.htp.less.Cust;


//  Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
//  метод  toString().  Создать второй класс, агрегирующий массив типа  Customer, с подходящими конструкторами и 
//  методами. Задать критерии выбора данных и вывести эти данные на консоль.  

//  Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.

//    Найти и вывести:  
// a) список покупателей в алфавитном порядке;  
// b) список покупателей, у которых номер кредитной карточки находится в заданном интервале 

import java.util.List;

public class Main {

	public static void main(String[] args) { 
		
		Shop supermarket = new Shop("Supermarket");
		Logic logic = new Logic();
		View view = new View();

		supermarket.addCustomerToShopList(new Customer(0, "Иванов", "Иван", "Русский", 34_27_83_54, 92111));
		supermarket.addCustomerToShopList(new Customer(1, "Петров", "Петр", "Русский", 20_30_94_75, 83455));
		supermarket.addCustomerToShopList(new Customer(2, "Лукашев", "Дмитрий", "Беларус", 36_67_55_36, 54569));
		supermarket.addCustomerToShopList(new Customer(3, "Летейко", "Герман", "Литовец", 24_35_56_97, 75674));
		supermarket.addCustomerToShopList(new Customer(4, "Панкратов", "Иван", "Украинец", 25_16_75_88, 16783));
		supermarket.addCustomerToShopList(new Customer(5, "Головко", "Семен", "Беларус", 67_97_18_39, 37891));

		view.view(supermarket.customersList);

		   System.out.println("\nсортировка по фамилии:");

		List<Customer> listSortByName = logic.getListBySurname(supermarket.customersList);
		
		view.view(listSortByName);

		   System.out.println("\nсортировка по номеру карты в задданом диапазоне:");

		List<Customer> listSortByDiapazonCreditCard = logic.getListByBankAccountNumber(supermarket.customersList, 33_44_55_66, 66_77_88_99);
		
		view.view(listSortByDiapazonCreditCard);
		
	}

}
