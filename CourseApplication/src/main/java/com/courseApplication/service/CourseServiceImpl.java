package com.courseApplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseApplication.Repo.CourseDao;
import com.courseApplication.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{

//	List<Course> courseList;
	
	@Autowired
	private CourseDao courseDao;
	
	public CourseServiceImpl() {
//		courseList = new ArrayList<>();
//		
//		courseList.add(new Course(121, "Core Java", "This course contains basics of java"));
//		courseList.add(new Course(151, "Python", "This course contains python fundamentals"));
//		
	}

	@Override
	public List<Course> getAllCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Course getCourseById(long courseId) {
		
//		Course c = null;
//		
//		for (Course course : courseList) {
//			if (course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		
		Optional<Course> course =  courseDao.findById(courseId);
		Course course_found = course.get();
		return course_found;
	}

	@Override
	public Course addCourse(Course course) {
		
		//courseList.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
//		courseList.forEach(c1 -> {
//			if (c1.getId() == course.getId()) {
//				c1.setTitle(course.getTitle());
//				c1.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		//courseList =  this.courseList.stream().filter(e1 -> e1.getId() != parseLong).collect(Collectors.toList());
		courseDao.deleteById(parseLong);
	}

}
