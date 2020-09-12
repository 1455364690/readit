package com.sunjh.test.reedit.service;

import com.sunjh.test.reedit.data.UserVo;
import com.sunjh.test.reedit.model.User;

/**
 * @author sunjh
 * @date 2020/6/26 23:32
 */
public interface UserService {
    UserVo createUser(String name);

    UserVo getUserById(Long userId);

    UserVo updateUser(User user);
}
