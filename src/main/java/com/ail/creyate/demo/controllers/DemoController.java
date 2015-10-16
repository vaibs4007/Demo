package com.ail.creyate.demo.controllers;

import com.ail.core.account.models.CoreMyAccount;
import com.ail.creyate.demo.models.MyAccount;
import com.ail.creyate.demo.service.MyAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by vaibhav on 15/10/15.
 */

@RestController
@EnableMongoAuditing
public class DemoController {


    @Autowired
    private MyAccountService myAccountService;

    @RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
    public List<CoreMyAccount> getAccount(@PathVariable("id") String id) {

//     MyAccount myAccount = (MyAccount) myAccountService.find(id).get(0);
//        System.out.println( myAccount.getDob());

        List<CoreMyAccount> coreMyAccounts = myAccountService.find(id);

        CoreMyAccount coreMyAccount = coreMyAccounts.get(0);
        MyAccount myAccount = (MyAccount) coreMyAccount;


        return myAccountService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createAccount(@RequestBody @Valid final MyAccount account) {
        System.out.println("Accessing base controller");
        return myAccountService.insert(account);
    }

}
