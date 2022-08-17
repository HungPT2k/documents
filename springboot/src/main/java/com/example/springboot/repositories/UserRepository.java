package com.example.springboot.repositories;
import com.example.springboot.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,Integer> {
    List<Users> findByEmail(String email);
    List<Users> findByPassWordUser(String password);
}
