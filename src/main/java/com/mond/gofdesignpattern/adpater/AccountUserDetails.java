package com.mond.gofdesignpattern.adpater;

import com.mond.gofdesignpattern.adpater.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getName() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
