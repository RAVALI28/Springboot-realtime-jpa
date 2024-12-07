package com.springlearning.springboot_realtime_jpa_app.Repository;

import com.springlearning.springboot_realtime_jpa_app.Model.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Spring Data JPA Implementation
@Repository
public interface ProductSpringDataJpaRepository extends JpaRepository<Product, Integer> {

    public List<Product> getAllProductByName(String name);
}
