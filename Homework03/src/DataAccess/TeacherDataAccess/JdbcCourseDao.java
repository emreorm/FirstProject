package DataAccess.TeacherDataAccess;

import entities.Teacher;

public class JdbcCourseDao implements ITeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Teacher added to database with JDBC: " + teacher.getName());
		
	}

}
