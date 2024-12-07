package com.springlearning.springboot_realtime_jpa_app.Controller;

import com.springlearning.springboot_realtime_jpa_app.Model.Product;
import com.springlearning.springboot_realtime_jpa_app.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    //Get all products
    @GetMapping("/findAll")
    public List<Product> fetchAllProducts(){
       return productService.fetchAllProducts();
    }

    //Get Product By Id
    @GetMapping("/getProductById/{productId}")
    public Optional<Product> getProductById(@PathVariable("productId") String productId){
        return productService.getProductById(productId);
    }

    //Get Product by Name
    @GetMapping("/getAllProductsByName/{productName}")
    public List<Product> getAllProductByName(@PathVariable("productName") String productName){
        return productService.getAllProductByName(productName);
    }

    //Create/Save new Product
    @PostMapping("/createProduct")
     public Product createProduct(@RequestBody Product product){
       return productService.createProduct(product);
    }

    //Update Product
    @PutMapping("/updateProduct/{id}")
    public ResponseEntity<String> updateProductById(@RequestBody Product product, @PathVariable int id){
        productService.updateProduct(product, id);
        return ResponseEntity.ok("Updated");
    }

    //Delete Product
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProductById(@PathVariable int id){
        boolean isDeleted = productService.deleteProductById(id);
        return isDeleted?"Deleted Successfully" :"Failed to delete";
    }
}
