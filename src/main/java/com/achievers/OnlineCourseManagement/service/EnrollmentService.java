package com.achievers.OnlineCourseManagement.service;

import com.achievers.OnlineCourseManagement.entity.Course;
import com.achievers.OnlineCourseManagement.entity.Learner;

public class EnrollmentService {
	private LearnerService lSvc = new LearnerService();
	private CourseService cSvc = new CourseService();
	
	public String enrollCourse(int courseId, int enrollmentNo) {
		Course c = cSvc.getCourse(courseId);
		Learner l = lSvc.getLearner(enrollmentNo);
		if(c!=null && l!= null) {
		c.setNoOfLearners(c.getNoOfLearners()+1);
		l.setNoOfRegisteredCourse(l.getNoOfRegisteredCourse()+1);
		System.out.println(c);
		return "Course Enrolled Successfully";
		}
		return "Invalid data";
	}
	public String cancelCourse(int courseId, int enrollmentNo) {
		Course c = cSvc.getCourse(courseId);
		Learner l = lSvc.getLearner(enrollmentNo);
		if(c!=null && l!= null) {
		c.setNoOfLearners(c.getNoOfLearners()-1);
		l.setNoOfRegisteredCourse(l.getNoOfRegisteredCourse()-1);
		return "Course Cancelled Successfully";
		}
		return "Invalid data";
	}
	public String certifyLearner(int courseId, int enrollmentNo) {
		
		Course c = cSvc.getCourse(courseId);
		Learner l = lSvc.getLearner(enrollmentNo);
		if(c!=null && l!= null) {
		l.setNoOfCompletedCourse(l.getNoOfCompletedCourse()+1);
		return "Course "+c.getCourseName()+"Completed Successfully";
		}
		return "Invalid data";
	}
}
