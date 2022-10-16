package business;

import java.util.ArrayList;
import java.util.List;

import DataAccess.CourseDataAccess.ICourseDao;
import entities.Course;
import logging.ILogger;

public class CourseManager {
	private ICourseDao coursedao;
	private ILogger[] loggers;
	public List<String> listCourseName = new ArrayList<String>();
	
	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.coursedao=courseDao;
		this.loggers=loggers;
		
	}
	public void add(Course course) throws Exception	{
		coursedao.add(course);
	for (String courseCheck : listCourseName) {
		if(course.getName().equals(courseCheck)) {
			throw new Exception("This course already exist!");
		}
	}
	if (course.getUnitPrice()<0) {
		throw new Exception("course price is : " + course.getUnitPrice() + "Course price cannot be lower than 0$");
		
		
	}
		
	
	
	 for (ILogger logger : loggers) {
		logger.log(course.getName());
	}
	}
	

}
