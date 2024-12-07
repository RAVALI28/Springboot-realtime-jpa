package com.springlearning.springboot_realtime_jpa_app.Repository;

import com.springlearning.springboot_realtime_jpa_app.Model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepo {

    void insertProduct(Product product);

    List<Product> getAllProducts();

    Product findById(int id);

    Product updateProductById(Product productToBeUpdated, int id);

    boolean deleteProductById(int id);

}
