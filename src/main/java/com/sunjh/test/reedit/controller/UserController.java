package com.sunjh.test.reedit.controller;

import com.sunjh.test.reedit.data.UserDTO;
import com.sunjh.test.reedit.data.UserVo;
import com.sunjh.test.reedit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjh
 * @date 2020/6/26 17:36
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/user/add")
    public UserVo createUser(@RequestBody UserDTO userDTO) {

        return userService.createUser(userDTO.getName());
    }
}
