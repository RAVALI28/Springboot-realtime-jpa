package com.springlearning.springboot_realtime_jpa_app.ProductRunner;

import com.springlearning.springboot_realtime_jpa_app.Model.Product;
import com.springlearning.springboot_realtime_jpa_app.Repository.ProductRepo;
import com.springlearning.springboot_realtime_jpa_app.Repository.ProductSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//@Component
public class ProductCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private ProductRepo productRepoImpl;

    @Autowired
    private ProductSpringDataJpaRepository productSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {

//          Product SamsungFold3rdGen = new Product("Samsnug Fold", "samsung product", 599.0, 5);
//        productRepoImpl.insertProduct(SamsungFold3rdGen);
//        productSpringDataJpaRepository.save(SamsungFold3rdGen);


//        List<Product> productList = productRepoImpl.getAllProducts();
//        List<Product> productList = productSpringDataJpaRepository.findAll();
//        for(Product product : productList){
//            System.out.println(product.getName());
//            System.out.println(product.getDescription());
//            System.out.println(product.getPrice());
//            System.out.println(product.getStockQuantity());
//        }

//        System.out.println(productList);

        System.out.println("=====================================");

//        Product secondProduct = productRepoImpl.findById(2);
//        Product secondProduct = productSpringDataJpaRepository.findById(2).get();
//        System.out.println(secondProduct);

        System.out.println("====================================");


//        Product Google = new Product("Google Pixel", "google product", 1000.0, 10);
//        productRepoImpl.updateProductById(Google, 2);
//        Updating the Product
//        Product existingProduct = productSpringDataJpaRepository.getById(2);
//        Product Applevision = new Product("Apple Vision", "Apple product", 499.0, 2);
//        existingProduct.setName(Applevision.getName());
//        existingProduct.setDescription(Applevision.getDescription());
//        existingProduct.setPrice(Applevision.getPrice());
//        existingProduct.setStockQuantity(Applevision.getStockQuantity());
//        productSpringDataJpaRepository.save(existingProduct);



        System.out.println("======================================");

//        productRepoImpl.deleteProductById(7);
//       productSpringDataJpaRepository.deleteById(7);

    }
}
