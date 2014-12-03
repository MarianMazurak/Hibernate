package com.softserve.edu.ita.service;

import java.util.List;

import com.softserve.edu.ita.dao.DaoFactory;
import com.softserve.edu.ita.entity.Product;

public class ProductService {
	public void addProduct(Product product) {
        DaoFactory.getInstance().getProductDao().addElement(product);
    }

    public void updateProduct(Product product) {
        DaoFactory.getInstance().getProductDao().updateElement(product);
    }

    public Product getReaderById(Long productId) {
        return DaoFactory.getInstance().getProductDao().getElementByID(productId);
    }

    public List<Product> getAllReader() {
        return DaoFactory.getInstance().getProductDao().getAllElements();
    }

    public void deleteReader(Product product) {
        DaoFactory.getInstance().getProductDao().deleteElement(product);
    }
}
