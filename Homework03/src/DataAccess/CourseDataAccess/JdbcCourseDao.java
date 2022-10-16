package DataAccess.CourseDataAccess;

import entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added to database with JDBC: " + course.getName());
		
	}

}
