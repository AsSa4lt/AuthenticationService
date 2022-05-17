package com.st1tchqwerty.authenticationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    private TransactionRepository transactionRepository;
    @Override
    public CustomTransaction getTransactionById(int ID) {
        return null;
    }

    @Override
    public void addTransaction(CustomTransaction customTransaction) {
        transactionRepository.save(customTransaction);
    }

}
