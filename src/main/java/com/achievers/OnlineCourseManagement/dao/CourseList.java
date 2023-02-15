package com.achievers.OnlineCourseManagement.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.achievers.OnlineCourseManagement.entity.Course;

public class CourseList {
	private static List<Course> courseList = new ArrayList<Course>(); ;
	
	public static List<Course> getCourseList(){
		return courseList;
	}
}
