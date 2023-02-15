package com.achievers.OnlineCourseManagement.entity;
/*Course
           - courseId
		- courseName
		- couseDuration
		- courseCost
		- NoOfLearners
*/
public class Course {
	private int courseId;
	private String courseName;
	private int courseDuration;
	private float courseCost;
	private int noOfLearners;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Course(int courseId, String courseName, int courseDuration, float courseCost) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseCost = courseCost;
		this.noOfLearners = 0;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getCourseDuration() {
		return courseDuration;
	}


	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}


	public float getCourseCost() {
		return courseCost;
	}


	public void setCourseCost(float courseCost) {
		this.courseCost = courseCost;
	}


	public int getNoOfLearners() {
		return noOfLearners;
	}


	public void setNoOfLearners(int noOfLearners) {
		this.noOfLearners = noOfLearners;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", courseCost=" + courseCost + ", noOfLearners=" + noOfLearners + "]";
	}
	
}
