package com.sunjh.test.reedit.service.impl;

import com.sunjh.test.reedit.dao.UserDao;
import com.sunjh.test.reedit.data.UserVo;
import com.sunjh.test.reedit.model.User;
import com.sunjh.test.reedit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

/**
 * @author sunjh
 * @date 2020/6/26 23:33
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserVo createUser(String name) {
        User user = new User();
        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user.setDoTime(new Timestamp(System.currentTimeMillis()));
        user.setName(name);
        User savedUser = userDao.save(user);
        UserVo userVo = new UserVo();
        userVo.setId(savedUser.getId());
        userVo.setName(savedUser.getName());
        userVo.setCreateTime(savedUser.getCreateTime());
        userVo.setDoTime(savedUser.getDoTime());
        return userVo;
    }

    @Override
    public UserVo getUserById(Long userId) {
        return null;
    }

    @Override
    public UserVo updateUser(User user) {
        return null;
    }
}
