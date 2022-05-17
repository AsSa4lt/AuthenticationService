package com.st1tchqwerty.authenticationservice;

public interface TransactionService {
    CustomTransaction getTransactionById(int ID);

    void addTransaction(CustomTransaction customTransaction) ;

}
