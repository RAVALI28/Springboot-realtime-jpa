package com.springlearning.springboot_realtime_jpa_app.Repository;

import com.springlearning.springboot_realtime_jpa_app.Model.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

//JPA and Hibernate Implementation

@Repository
@Transactional
public class ProductRepoImpl implements ProductRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertProduct(Product product) {
        entityManager.merge(product);

    }

    @Override
    public List<Product> getAllProducts() {
        return entityManager.createQuery("SELECT p from Product p", Product.class).getResultList();
    }

    @Override
    public Product findById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public Product updateProductById(Product productToBeUpdated, int id) {
        Product originalProduct = entityManager.find(Product.class, id);
        originalProduct.setName(productToBeUpdated.getName());
        originalProduct.setDescription(productToBeUpdated.getDescription());
        originalProduct.setPrice(productToBeUpdated.getPrice());
        originalProduct.setStockQuantity(productToBeUpdated.getStockQuantity());
        return entityManager.merge(productToBeUpdated);

    }

    @Override
    public boolean deleteProductById(int id) {
        Product productToBeDeleted = entityManager.find(Product.class, id);
        entityManager.remove(productToBeDeleted);
        return true;
    }
}
