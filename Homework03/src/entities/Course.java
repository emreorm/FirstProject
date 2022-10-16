package entities;

public class Course {
	private int id;
	private String name;
	private double unitPrice;
	private String duration;
	private String language;

	public Course(int id, String name, double unitPrice, String duration, String language) {
		this.id = id;
		this.unitPrice = unitPrice;
		this.duration = duration;
		this.language = language;
		this.name=name;
		

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
