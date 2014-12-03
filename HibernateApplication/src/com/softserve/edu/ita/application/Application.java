package com.softserve.edu.ita.application;


import com.softserve.edu.ita.entity.*;
import com.softserve.edu.ita.service.*;


public class Application {

	public static void main(String[] args) {
		Client client1 = new Client();
		client1.setName("testname");
		client1.setCountry("Ukraine");
		
		Product product1 = new Product();
		product1.setName("microwave oven");
		product1.setMaker("Klause");
		product1.setCountry("Germany");
		
		Order order1 = new Order();
		order1.setClientId(client1);
		order1.setProductId(product1);
		order1.setDate(new java.sql.Date((long) (new java.util.Date())
				.getTime() + 60 * 60 * 24 * 1000 * 4));

		ProductService ps = new ProductService();
		ClientService cs = new ClientService();
		OrderService os = new OrderService();
		
		ps.addProduct(product1);
		cs.addClient(client1);
		os.addOrder(order1);
	}

}
