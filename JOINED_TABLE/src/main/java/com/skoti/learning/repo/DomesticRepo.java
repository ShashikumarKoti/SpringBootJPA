package com.skoti.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skoti.learning.entity.Domestic;

@Repository
public interface DomesticRepo extends JpaRepository<Domestic, Integer>{

}
