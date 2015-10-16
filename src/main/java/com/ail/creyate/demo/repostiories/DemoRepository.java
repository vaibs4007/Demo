package com.ail.creyate.demo.repostiories;

import com.ail.core.account.models.CoreMyAccount;
import com.ail.core.account.repository.CoreAccountRepository;
import com.ail.creyate.demo.models.MyAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by vaibhav on 16/10/15.
 */
public interface DemoRepository extends CoreAccountRepository {

    //
//    @Query(value = " { 'email' :?0 }")
//    MyAccount findOneByEmail(@Param("email") String email);
//
    @Query(value = "{firstName: ?0}")
    List<CoreMyAccount>  findByName(String firstName);
}
