package com.achievers.OnlineCourseManagement.dao;

import java.util.ArrayList;
import java.util.List;

import com.achievers.OnlineCourseManagement.entity.Learner;

public class LearnerList {
private static ArrayList<Learner> learnerList = new ArrayList<Learner>();
	
	public static List<Learner> getLearnerList(){
		return learnerList;
	}
}
