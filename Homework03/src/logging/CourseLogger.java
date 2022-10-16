package logging;

public class CourseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Course logged :" + data);
		
	}

}
