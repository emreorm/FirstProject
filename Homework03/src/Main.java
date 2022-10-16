import DataAccess.CategoryDataAccess.HibernateCategoryDao;
import DataAccess.CourseDataAccess.JdbcCourseDao;
import DataAccess.TeacherDataAccess.HibernateTeacherDao;
import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import entities.Category;
import entities.Course;
import entities.Teacher;
import logging.CategoryLogger;
import logging.CourseLogger;
import logging.DataBaseLogger;
import logging.ILogger;
import logging.TeacherLogger;

public class Main {

	public static void main(String[] args)throws Exception {
		Category category1 = new Category(1, "Coding");
		Category category2 = new Category(2, "Web Design");
		Category category3 = new Category(3, "Application development");
		
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),new ILogger[] {new CategoryLogger(), new DataBaseLogger()
			
		});
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
		
		
		
		Course course1 = new Course(1, "firstCourse", 0, "3 months", "Java");
		Course course2 = new Course(2, "secondCourse", 3000, "6 months", "C#");
		Course course3 = new Course(3, "thirdCourse", 3000, "4 months", "Kotlin");
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao()	, new ILogger[] {
				new CourseLogger(), new DataBaseLogger()
		});
		
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		
		
		Teacher teacher1 = new Teacher(1, "Engin", "Demiroğ", 28);
		Teacher teacher2 = new Teacher(2, "Emre", "Orman", 23);
		Teacher teacher3 = new Teacher(3, "Ali", "Ozdemir", 35);
		
		TeacherManager teacherManager = new TeacherManager(new HibernateTeacherDao(), new ILogger[] {
				new TeacherLogger(), new DataBaseLogger()
		});
		teacherManager.add(teacher1);
		teacherManager.add(teacher2);
		teacherManager.add(teacher3);
		
		

	}

}
