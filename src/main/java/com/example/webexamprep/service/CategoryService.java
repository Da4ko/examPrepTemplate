package com.example.webexamprep.service;

import com.example.webexamprep.model.entity.Category;
import com.example.webexamprep.model.entity.enums.CategoryName;

public interface CategoryService {
    void initCategories();

    Category findByName(CategoryName categoryName);
}
