package com.achievers.OnlineCourseManagement.service;


import java.util.List;

import com.achievers.OnlineCourseManagement.dao.LearnerList;
import com.achievers.OnlineCourseManagement.entity.Learner;

public class LearnerService {
	
	private List<Learner> lList = LearnerList.getLearnerList();
	
	//Add a new Learner to the LearnerList
	public String addLearner(Learner l) {
		lList.add(l);
		return "Learner added Successfully";
	}
	
	//Get a single Learner
	public Learner getLearner(int enrollmentNo) {
		for(Learner l:lList) {
			if(l.getEnrollmentNo() == enrollmentNo) {
				return l;
			}
		}
		return null;
	}
	
	//Get all the Learners from the list
	public List<Learner> getAllLearner(){
		return lList;
	}
	
	//Update an already available learner
	public String updateLearner(int enrollmentNo, Learner l) {
		for(Learner l1:lList) {
			if(l1.getEnrollmentNo() == enrollmentNo) {
				l1.setLearnerName(l.getLearnerName());
				l1.setQualification(l.getQualification());
				return "Learner updated Successfully";
			}
		}
		return "Learner Unavailable";
	}
	
	//Delete an already available Learner
	public String deleteLearner(int enrollmentNo) {
		for(Learner l:lList) {
			if(l.getEnrollmentNo() == enrollmentNo) {
				lList.remove(l);
				return "Learner Deleted Successfully";
			}
		}
		return "Learner Unavailable";
	}
}
