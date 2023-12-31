package com.example.webexamprep.repository;

import com.example.webexamprep.model.entity.Product;
import com.example.webexamprep.model.entity.enums.CategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
        @Query("SELECT SUM(p.price) FROM Product p")
        BigDecimal findTotalProductPrice();

        List<Product> findAllByCategory_Name(CategoryName categoryName);
}
