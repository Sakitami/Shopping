package com.shopping.service;

import com.shopping.entity.Product;
import com.shopping.utils.Response;

import java.util.List;


public interface ProductService {
    public Product getProduct(int id);

    public Product getProduct(String name);

    public void addProduct(Product product);

    Response deleteProduct(int id);

    public boolean updateProduct(Product product);

    public List<Product> getProductsByKeyWord(String searchKeyWord);

    public List<Product> getProductsByType(int type);

    public List<Product> getAllProduct();

    public List<Product> getAllProductByUserId(String userId);

}
