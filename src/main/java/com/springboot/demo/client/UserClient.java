package com.springboot.demo.client;

import com.springboot.demo.config.UserPorperties;

public class UserClient {

    private UserPorperties userPorperties;
    public UserClient() {
    }
    public UserClient(UserPorperties p) {
        this.userPorperties = p;
    }
    public String getName() {
        return userPorperties.getName();
    }


}
