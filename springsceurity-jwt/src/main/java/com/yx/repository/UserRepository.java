package com.yx.repository;

import com.yx.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @www.codesheep.cn
 * 20190312
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
