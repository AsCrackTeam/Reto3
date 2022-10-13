package com.g15.jpa.repository;

import com.g15.jpa.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author jonat
 */
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
