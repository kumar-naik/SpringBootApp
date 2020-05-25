package org.spring.swagger.service;

import org.spring.swagger.bean.User;
import org.spring.swagger.bean.UserDto;

public interface UserService {
    public void delete(int id);
    public User findOne(String username);
    public User findById(int id);
    public UserDto update(UserDto userDto);
    public User save(UserDto user);

    Object findAll();
}
