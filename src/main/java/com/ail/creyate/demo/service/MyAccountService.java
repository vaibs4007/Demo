package com.ail.creyate.demo.service;

import com.ail.core.account.models.CoreMyAccount;
import com.ail.core.account.repository.CoreAccountRepository;
import com.ail.core.account.service.CoreMyAccountService;
import com.ail.creyate.demo.models.MyAccount;
import com.ail.creyate.demo.repostiories.DemoRepository;

import java.util.List;

/**
 * Created by vaibhav on 16/10/15.
 */
public interface MyAccountService extends CoreMyAccountService {

    List<CoreMyAccount> find(String id);

}
