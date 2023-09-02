package com.example.webexamprep.service.Impl;

import com.example.webexamprep.model.entity.Category;
import com.example.webexamprep.model.entity.enums.CategoryName;
import com.example.webexamprep.repository.CategoryRepository;
import com.example.webexamprep.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initCategories() {
        if(categoryRepository.count() == 0) {
            Arrays.stream(CategoryName.values())
                    .forEach(categoryName -> {
                        Category category = new Category(categoryName,
                                "Description for " + categoryName.name());

                        categoryRepository.save(category) ;
                    });
        }
    }
}
