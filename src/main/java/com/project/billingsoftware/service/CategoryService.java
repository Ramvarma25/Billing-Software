package com.project.billingsoftware.service;

import com.project.billingsoftware.io.CategoryRequest;
import com.project.billingsoftware.io.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request, MultipartFile file);

    List<CategoryResponse> read();

    void delete(String CategoryId);
}
