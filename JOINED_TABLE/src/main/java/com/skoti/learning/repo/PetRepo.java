package com.skoti.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skoti.learning.entity.Pet;

@Repository
public interface PetRepo extends JpaRepository<Pet, Integer>{

}
