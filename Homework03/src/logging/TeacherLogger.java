package logging;

public class TeacherLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Teacher logged :" + data);
		
	}

}
