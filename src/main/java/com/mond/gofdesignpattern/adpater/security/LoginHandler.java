package com.mond.gofdesignpattern.adpater.security;

public class LoginHandler {

    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getName();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
