package com.example.interview.repository;

import com.example.interview.repository.model.UserDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<UserDo, Long> {
}
