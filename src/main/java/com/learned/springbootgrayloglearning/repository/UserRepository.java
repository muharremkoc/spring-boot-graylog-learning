package com.learned.springbootgrayloglearning.repository;

import com.learned.springbootgrayloglearning.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
