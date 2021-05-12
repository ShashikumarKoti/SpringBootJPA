package com.skoti.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skoti.learning.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
