package com.dal.demo.aplication.lasting;


import lombok.Getter;

@Getter
public enum ERole {
    USER("USER"),
    ADMIN("ADMIN");

    ERole(String name){
        this.name = name;
    }
    private final String name;
}
