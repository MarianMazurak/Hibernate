package com.softserve.edu.ita.dao;

import com.softserve.edu.ita.dao.DaoFactory;

public class DaoFactory {
	private ProductDAO productDao = null;
	private ClientDAO clientDao = null;
	private OrderDAO orderDao = null;

	private static DaoFactory instance = null;

	private DaoFactory() {
		this.clientDao = new ClientDAO();
		this.orderDao = new OrderDAO();
		this.productDao = new ProductDAO();
	}

	public static synchronized DaoFactory getInstance() {
		if (instance == null) {
			instance = new DaoFactory();
		}
		return instance;
	}

	public ProductDAO getProductDao() {
		return productDao;
	}

	public ClientDAO getClientDao() {
		return clientDao;
	}

	public OrderDAO getOrderDao() {
		return orderDao;
	}

}
