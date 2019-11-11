package com.electropeyk.accountservice.service;


import com.electropeyk.accountservice.dto.UserDto;
import com.electropeyk.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
