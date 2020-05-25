package org.spring.swagger.service;

import org.spring.swagger.bean.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public Product getProductById(String id) {
        return null;
    }

    @Override
    public void saveProduct(Product product) {

    }

    @Override
    public void deleteProduct(String id) {

    }
}
