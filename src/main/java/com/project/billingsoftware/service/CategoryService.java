package com.project.billingsoftware.service;

import com.project.billingsoftware.io.CategoryRequest;
import com.project.billingsoftware.io.CategoryResponse;

import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request);

    List<CategoryResponse> read();

    void delete(String CategoryId);
}
