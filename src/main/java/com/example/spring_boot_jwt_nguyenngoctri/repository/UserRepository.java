package com.example.spring_boot_jwt_nguyenngoctri.repository;

import com.example.spring_boot_jwt_nguyenngoctri.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
