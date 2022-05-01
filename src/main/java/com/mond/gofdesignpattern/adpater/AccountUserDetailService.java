package com.mond.gofdesignpattern.adpater;

import com.mond.gofdesignpattern.adpater.security.UserDetails;
import com.mond.gofdesignpattern.adpater.security.UserDetailsService;

public class AccountUserDetailService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String userName) {
        Account account = accountService.findAccountByUserName(userName);
        return new AccountUserDetails(account);
    }
}
