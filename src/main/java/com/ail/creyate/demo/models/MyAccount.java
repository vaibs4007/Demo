package com.ail.creyate.demo.models;

import com.ail.core.account.models.CoreMyAccount;

/**
 * Created by vaibhav on 16/10/15.
 */
public class MyAccount extends CoreMyAccount {

    String dob;
    String email;
    




    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
