package com.airtibe.java.payFlow.controller;

import com.airtibe.java.payFlow.entity.Transaction;
import com.airtibe.java.payFlow.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService _transactionService;

    @PostMapping
    public Transaction sendMoney(@RequestBody Transaction transaction){
        return _transactionService.sendMoney(transaction);
    }
}
