/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.gordis.transactions.repository;

import com.gordis.transactions.entities.transactions;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author argue
 */
public interface transactionRepository extends JpaRepository<transactions, Long> {
    
}
