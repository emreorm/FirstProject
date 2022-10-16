package logging;

public class CategoryLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Category logged :" + data);
		
	}

	
}
