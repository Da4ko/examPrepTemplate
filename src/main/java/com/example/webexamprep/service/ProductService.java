package com.example.webexamprep.service;

import com.example.webexamprep.model.entity.enums.CategoryName;
import com.example.webexamprep.model.service.ProductServiceModel;
import com.example.webexamprep.model.view.ProductViewModel;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    void add(ProductServiceModel productServiceModel);
    BigDecimal getTotalSum();
    List<ProductViewModel> findAllProductsByCategoryName(CategoryName categoryName);

    void buyById(String id);

    void buyAll();
}
