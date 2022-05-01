package com.mond.gofdesignpattern.adpater.security;

public interface UserDetailsService {

    UserDetails loadUser(String userName);
}
