package com.example.spring_boot_jwt_nguyenngoctri.service;


import com.example.spring_boot_jwt_nguyenngoctri.authen.UserPrincipal;
import com.example.spring_boot_jwt_nguyenngoctri.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
