package com.airtibe.java.payFlow.service;

import com.airtibe.java.payFlow.entity.Transaction;
import com.airtibe.java.payFlow.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.TreeMap;
import java.util.concurrent.TransferQueue;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository _transactionRepository;

    /*
     * What Spring does at startup:
     * Spring creates the TransactionRepository bean (because it extends JpaRepository),
     * and then injects it into this service automatically using @Autowired.
     * This allows us to call transactionRepository.save(...) without manually creating objects.
     */

    public Transaction sendMoney(Transaction transaction){
        return _transactionRepository.save(transaction);
    }
}
