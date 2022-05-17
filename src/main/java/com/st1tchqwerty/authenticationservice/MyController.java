package com.st1tchqwerty.authenticationservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value = "/newtransaction", method = RequestMethod.POST)
    public void update(@RequestParam int id,
                         @RequestParam String timeStamp,
                         @RequestParam String type,
                         @RequestParam String actor,
                         @RequestParam String data) {


        CustomTransaction mytr = new CustomTransaction(id, timeStamp, type, actor, data);
        transactionService.addTransaction(mytr);
    }

}
