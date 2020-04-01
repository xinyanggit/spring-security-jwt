package com.yx.service;

import com.yx.model.entity.User;

/**
 * @author yx start
 * @create 2020/4/1,15:00
 */
public interface AuthService {

    User register( User userToAdd );
    String login( String username, String password );
}