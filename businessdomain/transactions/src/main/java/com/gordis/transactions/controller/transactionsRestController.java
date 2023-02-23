/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package com.gordis.transactions.controller;

import com.gordis.transactions.entities.transactions;
import com.gordis.transactions.repository.transactionRepository;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
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
@RequestMapping("/transactions")
public class transactionsRestController {
    @Autowired
    transactionRepository TransactionRepository;
    @GetMapping()
    public List<transactions> findAll() {
        return TransactionRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public transactions get(@PathVariable String id) {
        return null;
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody transactions input) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody transactions input) {
        transactions save = TransactionRepository.save(input);
        return ResponseEntity.ok(save);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
