/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gordis.transactions.entities;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.nio.channels.Channel;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author argue
 */
@Entity
@Data
public class transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String reference;
    private String accountlban;
    private Date date;
    private double amount;
    private double fee;
    private String description;
    private Status status;
    private Channel channel;
}