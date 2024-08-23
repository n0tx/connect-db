package com.riki.connect_db.repository;

import com.riki.connect_db.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
