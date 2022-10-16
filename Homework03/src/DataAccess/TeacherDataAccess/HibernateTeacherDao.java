package DataAccess.TeacherDataAccess;

import entities.Teacher;

public class HibernateTeacherDao implements ITeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Teacher added to database with Hibernate: " +teacher.getName() );
		
	}

}
