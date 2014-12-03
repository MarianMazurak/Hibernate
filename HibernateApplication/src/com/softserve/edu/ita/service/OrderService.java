package com.softserve.edu.ita.service;

import java.util.List;

import com.softserve.edu.ita.dao.DaoFactory;
import com.softserve.edu.ita.entity.Order;

public class OrderService {
	public void addOrder(Order order) {
		DaoFactory.getInstance().getOrderDao().addElement(order);
	}

	public void updateOrder(Order order) {
		DaoFactory.getInstance().getOrderDao().updateElement(order);
	}

	public Order getUsingById(Long orderId) {
		return DaoFactory.getInstance().getOrderDao().getElementByID(orderId);
	}

	public List<Order> getAllOrder() {
		return DaoFactory.getInstance().getOrderDao().getAllElements();
	}

	public void deleteUsing(Order order) {
		DaoFactory.getInstance().getOrderDao().deleteElement(order);
	}
}
