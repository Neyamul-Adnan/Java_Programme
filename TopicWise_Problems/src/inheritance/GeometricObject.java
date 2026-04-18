package inheritance;

public class GeometricObject {

	private String color;
	private boolean isFilled;
	
	public GeometricObject() {
		color = "green";
		isFilled = false;
	}

	public GeometricObject(String color, boolean isFilled) {
		super();
		this.color = color;
		this.isFilled = isFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}
	
	public String toString() {
		return "Filled : " +isFilled + "\nColor : " +color;
	}
	
	
}
