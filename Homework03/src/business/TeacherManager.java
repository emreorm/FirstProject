package business;

import DataAccess.TeacherDataAccess.ITeacherDao;
import entities.Teacher;
import logging.ILogger;

public class TeacherManager {
	private ILogger[] loggers;
	private ITeacherDao teacherDao;
	 
	public TeacherManager( ITeacherDao teacherDao, ILogger[] loggers) {
		this.loggers=loggers;
		this.teacherDao=teacherDao;
		
		
	}
	public void add(Teacher teacher) {
		teacherDao.add(teacher);
		
		for (ILogger logger : loggers) {
			logger.log(teacher.getName());
		}
		
		
		}
	}


