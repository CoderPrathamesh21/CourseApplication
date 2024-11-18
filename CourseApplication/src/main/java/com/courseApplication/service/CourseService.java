package com.courseApplication.service;

import java.util.List;

import com.courseApplication.entity.Course;

public interface CourseService {
	
	public List<Course> getAllCourses();
	
	public Course getCourseById(long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(long parseLong);

}
