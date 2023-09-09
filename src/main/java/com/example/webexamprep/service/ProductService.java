package com.example.webexamprep.service;

import com.example.webexamprep.model.service.ProductServiceModel;

import java.math.BigDecimal;

public interface ProductService {
    void add(ProductServiceModel productServiceModel);
    BigDecimal getTotalSum();
}
