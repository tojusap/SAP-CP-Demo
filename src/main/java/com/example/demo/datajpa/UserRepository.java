package com.example.demo.datajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * description: UserRepository
 * date: 11/21/20 2:43 PM
 * author: fourwood
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findById(long id);
}
