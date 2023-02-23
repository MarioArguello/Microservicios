/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.gordis.product.controller;

import com.gordis.product.entities.product;
import com.gordis.product.repository.productRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author argue
 */
@RestController
@RequestMapping("/product")
public class productRestController {
     @Autowired
    productRepository ProductRepository;
    @GetMapping()
    public List<product> findAll() {
        return ProductRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public product get(@PathVariable long id) {
        return ProductRepository.findById(id).get();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody product input) {
       product save= ProductRepository.save(input);
        return ResponseEntity.ok(save);
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody product input) {
        product save = ProductRepository.save(input);
        return ResponseEntity.ok(save);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        Optional<product> FindById = ProductRepository.findById(id);
        if(FindById.get() != null){
            ProductRepository.delete(FindById.get());
        }
        return ResponseEntity.ok().build();
    }
}
