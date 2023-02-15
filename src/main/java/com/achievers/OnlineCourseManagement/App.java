package com.achievers.OnlineCourseManagement;

import java.util.Scanner;

import com.achievers.OnlineCourseManagement.entity.Course;
import com.achievers.OnlineCourseManagement.entity.Learner;
import com.achievers.OnlineCourseManagement.service.CourseService;
import com.achievers.OnlineCourseManagement.service.EnrollmentService;
import com.achievers.OnlineCourseManagement.service.LearnerService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		CourseService cSvc = new CourseService();
		LearnerService lSvc = new LearnerService();
		EnrollmentService enSvc = new EnrollmentService();
		int mOption = 0;
		System.out.println("Welcome to Online Course Enrollment System");
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("Main Menu\n1.Course Management \n2.Learner Management\n3.Enrollment Service\n4.Exit\n");
		System.out.println("Enter your choice: ");
		mOption = ip.nextInt();
		while (mOption == 1 || mOption == 2 || mOption == 3) {
			switch (mOption) {
			case 1:
				
				int sOption = 0;
				int cID = 0;
				String cName = "";
				int cDuration = 0;
				float cCost = 0.0f;
				Course c;

				System.out.println("\nCourse Management");
				System.out.println("-----------------");
				System.out.println(
						"\n1.Add Course\n2.View Course\n3.View All Courses\n4.update COurse\n5.Delete Course\n6.Exit");

				System.out.println("Enter your choice: ");
				sOption = ip.nextInt();

				switch (sOption) {
				case 1:
					System.out.println("Add a Course");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					System.out.println("Enter the Course Name:");
					cName = ip.next();
					System.out.println("Enter the Course Duration:");
					cDuration = ip.nextInt();
					System.out.println("Enter the Course Cost:");
					cCost = ip.nextFloat();
					c = new Course(cID, cName, cDuration, cCost);
					System.out.println(cSvc.addCourse(c));
					break;
				case 2:
					System.out.println("View a Course");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					c = cSvc.getCourse(cID);
					if (c != null)
						System.out.println(c);
					else
						System.out.println("Course Unavilable");
					break;
				case 3:
					System.out.println("View "+cSvc.getAllCourse().size()+" Course");
					System.out.println("CID\tCNAME\tCDURATION    CCOST   \tNoOfLearners");
					for(Course c1:cSvc.getAllCourse()) {
						System.out.println(c1.getCourseId()+"\t"+c1.getCourseName()+"\t   "+c1.getCourseDuration()+"\t    "+c1.getCourseCost()+"\t   "+c1.getNoOfLearners());
					}
					System.out.println();
					break;
				case 4:
					System.out.println("Update a Course");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					System.out.println("Enter the Course Name:");
					cName = ip.next();
					System.out.println("Enter the Course Duration:");
					cDuration = ip.nextInt();
					System.out.println("Enter the Course Cost:");
					cCost = ip.nextFloat();
					c = new Course(cID, cName, cDuration, cCost);
					System.out.println(cSvc.updateCourse(cID, c));
					break;
				case 5:
					System.out.println("Delete a Course");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					System.out.println(cSvc.deleteCourse(cID));
					break;
				case 6:
					System.out.println("Thank you for working with Course Management..");
					break;
				default:
					System.out.println("Wrong Option");
					break;
				}
				break;
			case 2:
				int enrollmentNo = 0;
				String lName = "", lQualification = "";
				Learner l = null;
				System.out.println("\nLearner Management");
				System.out.println("--------------------");
				System.out.println(
						"\n1.Add Learner\n2.View Learner\n3.View All Learner\n4.update Learner\n5.Delete Learner\n6.Exit");

				System.out.println("Enter your choice: ");
				sOption = ip.nextInt();

				switch (sOption) {
				case 1:
					System.out.println("Add a Learner");
					System.out.println("Enter the Enrollment Number:");
					enrollmentNo = ip.nextInt();
					System.out.println("Enter the Learner Name:");
					lName = ip.next();
					System.out.println("Enter the Qualification:");
					lQualification = ip.next();
					
					l = new Learner(enrollmentNo,lName,lQualification);
					System.out.println(lSvc.addLearner(l));
					break;
				case 2:
					System.out.println("View a Learner");
					System.out.println("Enter the Enrollment Number:");
					enrollmentNo = ip.nextInt();
					l = lSvc.getLearner(enrollmentNo);
					if (l != null)
						System.out.println(l);
					else
						System.out.println("Learner Unavilable");
					break;
				case 3:
					System.out.println("View "+lSvc.getAllLearner().size()+" Learner");
					System.out.println("LID\tLNAME\tLQUALIFICATION\tREGISTERED\tCOMPLETED");
					for(Learner l1:lSvc.getAllLearner()) {
						System.out.println(l1.getEnrollmentNo()+"\t"+l1.getLearnerName()+"\t   "+l1.getQualification()+"\t\t    "+l1.getNoOfRegisteredCourse()+"\t \t  "+l1.getNoOfCompletedCourse());
					}
					System.out.println();
					break;
				case 4:
					System.out.println("Update a Learner");
					System.out.println("Enter the Enrollment Number:");
					enrollmentNo = ip.nextInt();
					System.out.println("Enter the Learner Name:");
					lName = ip.next();
					System.out.println("Enter the Qualification:");
					lQualification = ip.next();
					
					l = new Learner(enrollmentNo,lName,lQualification);
					
					System.out.println(lSvc.updateLearner(enrollmentNo, l));
					break;
				case 5:
					System.out.println("Delete a Learner");
					System.out.println("Enter the Enrollment Number:");
					enrollmentNo = ip.nextInt();
					System.out.println(lSvc.deleteLearner(enrollmentNo));
					break;
				case 6:
					System.out.println("Thank you for working with Learner Management..");
					break;
				default:
					System.out.println("Wrong Option");
					break;
				}
				break;
			case 3:
				System.out.println("\nEnrollment Management");
				System.out.println("----------------------");
				System.out.println(
						"\n1.Enroll a Course\n2.Cancel a Course\n3.Certify a Learner\n4.Exit");

				System.out.println("Enter your choice: ");
				sOption = ip.nextInt();
				switch(sOption) {
				case 1:
					System.out.println("Course Enrollment");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					System.out.println("Enter the Enrollment Number:");
					enrollmentNo = ip.nextInt();
					System.out.println(enSvc.enrollCourse(cID, enrollmentNo));
					break;
				case 2:
					System.out.println("Course Cancellation");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					System.out.println("Enter the Enrollment Number:");
					enrollmentNo = ip.nextInt();
					System.out.println(enSvc.cancelCourse(cID, enrollmentNo));
					break;
				case 3:
					System.out.println("Learner Certification");
					System.out.println("Enter the Course ID:");
					cID = ip.nextInt();
					System.out.println("Enter the Enrollment Number:");
					enrollmentNo = ip.nextInt();
					System.out.println(enSvc.certifyLearner(cID, enrollmentNo));
					break;
				case 4:
					System.out.println("Thank you for working with Enrollment Management..");
					break;
				default:
					System.out.println("Wrong Option");
					break;
				}
				break;
			case 4:
				System.out.println("Thank you for working with Online Course Management..");
				break;
			default:
				System.out.println("Wrong Option");
				break;
			}
			System.out.println("Would you like to continue with Course or Learner or Enrollment ? Press 1 -  Course or 2 - Learner or 3 - Enrollment");
			mOption = ip.nextInt();
		}
	}
}
