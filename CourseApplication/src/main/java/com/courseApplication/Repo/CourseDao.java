package com.courseApplication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseApplication.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long>{

}
