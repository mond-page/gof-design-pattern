package com.mond.gofdesignpattern.adpater;

import com.mond.gofdesignpattern.adpater.security.LoginHandler;
import com.mond.gofdesignpattern.adpater.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        System.out.println(loginHandler.login("mond", "mond"));
    }
}
