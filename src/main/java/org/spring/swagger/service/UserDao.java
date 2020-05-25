package org.spring.swagger.service;

import org.spring.swagger.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {
    User findByUsername(String username);
    void deleteById(int id);
    User findById(int id);
    User save(User newUser);
}
