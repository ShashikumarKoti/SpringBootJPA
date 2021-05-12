package com.skoti.learning.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skoti.learning.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
