package com.firstproject.FirstProject.repo;

import com.firstproject.FirstProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
