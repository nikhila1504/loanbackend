package com.cts.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.cts.bean.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUserName(String userName);

}
