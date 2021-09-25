package com.example.spring_boot_jwt_nguyenngoctri.repository;

import com.example.spring_boot_jwt_nguyenngoctri.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
    Token findByToken(String token);
}
