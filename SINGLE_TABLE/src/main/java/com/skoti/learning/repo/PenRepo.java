package com.skoti.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skoti.learning.entity.Pen;

@Repository
public interface PenRepo  extends JpaRepository<Pen, Integer> {

}
