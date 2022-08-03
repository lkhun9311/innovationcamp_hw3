package com.sparta.homework3.domain;

import lombok.*;

import javax.persistence.*;


@Getter
@Entity
public class UserAccount extends TimeStamped {
    @Id
    @Column(length = 12)
    private String username;

    @Column(nullable = false, length = 32)
    private String password;

    protected UserAccount() {}

    public UserAccount(String username, String password){
        this.username = username;
        this.password = password;
    }
}
