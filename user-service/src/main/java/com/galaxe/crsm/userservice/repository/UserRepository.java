package com.galaxe.crsm.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galaxe.crsm.userservice.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
