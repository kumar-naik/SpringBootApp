package org.spring.swagger.service;

import org.spring.swagger.bean.Product;

public interface ProductService {

    Product getProductById(String id);
    void saveProduct(Product product);
    void deleteProduct(String id);

}
