package com.g15.jpa.service;

import com.g15.jpa.entity.Category;
import com.g15.jpa.repository.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jonat
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> getCategory(){
        return categoryRepository.findAll();
    } 
   
    public Category insertCategory(Category category){
        return categoryRepository.save(category);
    }
    
    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).get();
    }

}
