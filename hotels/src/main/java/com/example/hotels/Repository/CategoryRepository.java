package com.example.hotels.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotels.Model.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}