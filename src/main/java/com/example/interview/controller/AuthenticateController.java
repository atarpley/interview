
package com.example.interview.controller;

import com.example.interview.model.UsernameAndPassword;
import com.example.interview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authenticate")
public class AuthenticateController {
    private final UserService userService;

    @Autowired
    public AuthenticateController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void authenticate(@RequestBody UsernameAndPassword usernameAndPassword) {
        // TODO:
        // - Implement Happy Path, (return 200 OK on good authentication)
        // - Implement Error Path (Return 401 Unauthorized on bad authentication)
    }
}