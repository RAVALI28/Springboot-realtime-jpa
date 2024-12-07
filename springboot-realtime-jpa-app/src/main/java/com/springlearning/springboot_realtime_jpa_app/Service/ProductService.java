package com.springlearning.springboot_realtime_jpa_app.Service;

import com.springlearning.springboot_realtime_jpa_app.Model.Product;
import com.springlearning.springboot_realtime_jpa_app.Repository.ProductSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductSpringDataJpaRepository productSpringDataJpaRepository;

    public List<Product> fetchAllProducts(){
       return productSpringDataJpaRepository.findAll();
    }

    public Optional<Product> getProductById(String id){
       Optional<Product> listedIdProduct = productSpringDataJpaRepository.findById(Integer.parseInt(id));
       return listedIdProduct;
    }

    public List<Product> getAllProductByName(String name){
       return productSpringDataJpaRepository.getAllProductByName(name);
    }

    public Product createProduct(Product product){
       return productSpringDataJpaRepository.save(product);
    }

    public void updateProduct(Product product, int id){
       Product existingProduct = productSpringDataJpaRepository.findById(id).orElseThrow();
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStockQuantity(product.getStockQuantity());
        productSpringDataJpaRepository.save(existingProduct);
    }

   public boolean deleteProductById(int id){
        List<Product> productList = productSpringDataJpaRepository.findAll();
        boolean isProductExist = false;
        if(productList != null){
           isProductExist = productList.stream().anyMatch(product -> product.getId() == id);
       }

        productSpringDataJpaRepository.deleteById(id);
        return true;
    }
}
