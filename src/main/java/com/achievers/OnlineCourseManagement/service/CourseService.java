package com.achievers.OnlineCourseManagement.service;

import java.util.List;

import com.achievers.OnlineCourseManagement.dao.CourseList;
import com.achievers.OnlineCourseManagement.entity.Course;

public class CourseService {

	
	private List<Course> clist;
	
	public CourseService() {
		
		clist = CourseList.getCourseList();
	}
	
	//Add a New Course
	public String addCourse(Course c) {
		clist.add(c);
		return "Successfully Added";
	}
	
	//View a Single Course
	public Course getCourse(int courseId) {
		for(Course c:clist) {
			if(c.getCourseId() == courseId)
			{
				return c;
			}
		}
		return null;
	}
	
	//Getting list of course
	public List<Course> getAllCourse(){
		return clist;
	}
	
	//Updating a course
	public String updateCourse(int courseId, Course latest) {
		for(Course c:clist) {
			if(c.getCourseId() == courseId)
			{
				//clist.remove(c);
				//clist.add(latest);
				c.setCourseName(latest.getCourseName());
				c.setCourseCost(latest.getCourseCost());
				c.setCourseDuration(latest.getCourseDuration());
				return "Course Updated Successfully";
			}
		}
		return "Course Unavailable";
	}
	
	//Delete a Course
	public String deleteCourse(int courseId) {
		for(Course c:clist) {
			if(c.getCourseId() == courseId)
			{
				clist.remove(c);
				return "Course Deleted Successfully";
			}
		}
		return "Course Unavailable";
	}
}
