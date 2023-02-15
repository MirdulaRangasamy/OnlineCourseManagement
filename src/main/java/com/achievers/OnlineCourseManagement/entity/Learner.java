package com.achievers.OnlineCourseManagement.entity;
/*
 * - Learner
		- enrollmentNo
		- learnerName
		- qualification
		- noOfRegisteredCourse
		- noOfCompletedCourse
 * */
public class Learner {
	private int enrollmentNo;
	private String learnerName;
	private String qualification;
	private int noOfRegisteredCourse;
	private int noOfCompletedCourse;
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Learner(int enrollmentNo, String learnerName, String qualification) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.learnerName = learnerName;
		this.qualification = qualification;
	}
	public int getEnrollmentNo() {
		return enrollmentNo;
	}
	public void setEnrollmentNo(int enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}
	public String getLearnerName() {
		return learnerName;
	}
	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}
	public int getNoOfRegisteredCourse() {
		return noOfRegisteredCourse;
	}
	public void setNoOfRegisteredCourse(int noOfRegisteredCourse) {
		this.noOfRegisteredCourse = noOfRegisteredCourse;
	}
	public int getNoOfCompletedCourse() {
		return noOfCompletedCourse;
	}
	public void setNoOfCompletedCourse(int noOfCompletedCourse) {
		this.noOfCompletedCourse = noOfCompletedCourse;
	}
	
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Learner [enrollmentNo=" + enrollmentNo + ", learnerName=" + learnerName + ", qualification="
				+ qualification + ", noOfRegisteredCourse=" + noOfRegisteredCourse + ", noOfCompletedCourse="
				+ noOfCompletedCourse + "]";
	}
	
	
}
