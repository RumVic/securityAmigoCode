package com.it_academy.securityAmigoCode.service;

import com.it_academy.securityAmigoCode.domain.Role;
import com.it_academy.securityAmigoCode.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String userName);
    List<User> getUsers();

}
