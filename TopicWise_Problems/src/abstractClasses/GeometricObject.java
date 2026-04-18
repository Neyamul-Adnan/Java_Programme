package abstractClasses;

import java.util.Date;

public abstract class GeometricObject {

	String color;
	boolean isFilled;
	Date dateCreated;

	public GeometricObject() {
		dateCreated = new Date();
	}

	public GeometricObject(String color, boolean isFilled) {
		super();
		this.color = color;
		this.isFilled = isFilled;
	}

	public abstract void printArea();
}
