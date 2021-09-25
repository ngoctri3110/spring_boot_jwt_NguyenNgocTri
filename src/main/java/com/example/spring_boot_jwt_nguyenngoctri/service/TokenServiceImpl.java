package com.example.spring_boot_jwt_nguyenngoctri.service;

import com.example.spring_boot_jwt_nguyenngoctri.entity.Token;
import com.example.spring_boot_jwt_nguyenngoctri.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService{
    @Autowired
    private TokenRepository tokenRepository;
    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
