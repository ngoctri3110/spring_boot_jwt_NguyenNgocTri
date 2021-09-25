package com.example.spring_boot_jwt_nguyenngoctri.service;

import com.example.spring_boot_jwt_nguyenngoctri.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
