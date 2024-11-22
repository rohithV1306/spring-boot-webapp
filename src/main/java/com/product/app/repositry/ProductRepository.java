package com.product.app.repositry;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.product.app.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    
    List<Product> findByProductNameContainingAndProductTypeContaining(String productName, String productType);
    
    @Query("SELECT DISTINCT p.productType FROM Product p")
    List<String> findDistinctProductTypes();
    
 
    List<Product> findByProductName(String productName);
    
    
    List<Product> findByProductType(String productType);
    
   
}
