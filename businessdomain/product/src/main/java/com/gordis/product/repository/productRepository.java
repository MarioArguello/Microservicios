/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.gordis.product.repository;

import com.gordis.product.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author argue
 */
public interface productRepository extends JpaRepository<product, Long> {
    
}
