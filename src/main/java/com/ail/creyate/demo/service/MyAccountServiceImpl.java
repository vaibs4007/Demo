package com.ail.creyate.demo.service;

import com.ail.core.account.models.CoreMyAccount;
import com.ail.core.account.service.CoreMyAccountServiceImpl;
import com.ail.creyate.demo.models.MyAccount;
import com.ail.creyate.demo.repostiories.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vaibhav on 16/10/15.
 */

@Service("MyAccountService")
public class MyAccountServiceImpl extends CoreMyAccountServiceImpl implements MyAccountService {


    @Autowired
    DemoRepository demoRepository;


    @Override
    public  List<CoreMyAccount>  find(String id) {
        return demoRepository.findByName(id);
       /* if(obj == null)
        {
            System.out.println("//nukk"+id);
        }
        MyAccount myaccobj= (MyAccount)obj[0];
        return myaccobj;*/
    }
}
