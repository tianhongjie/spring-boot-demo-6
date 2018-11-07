package com.cdemo.demo06.repository;

import com.cdemo.demo06.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Charlie Tian
 * @date 11/7/18
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}