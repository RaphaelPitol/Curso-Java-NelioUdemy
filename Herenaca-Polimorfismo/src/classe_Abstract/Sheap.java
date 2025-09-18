package classe_Abstract;

public abstract class Sheap {
	protected Color color;
	
	public Sheap() {
		// TODO Auto-generated constructor stub
	}
	
	public Sheap(Color color) {
		this.color = color;
	}


	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
}
