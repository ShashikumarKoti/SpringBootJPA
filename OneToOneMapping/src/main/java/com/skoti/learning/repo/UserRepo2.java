package com.skoti.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skoti.learning.entity.User2;

@Repository
public interface UserRepo2 extends JpaRepository<User2, Integer> {

}
