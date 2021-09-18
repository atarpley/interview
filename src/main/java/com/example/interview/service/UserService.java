package com.example.interview.service;

import com.example.interview.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRespository userRespository;

    @Autowired
    public UserService(final UserRespository userRespository) {
        this.userRespository = userRespository;
    }
}
