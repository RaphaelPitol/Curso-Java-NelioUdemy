package classe_Abstract;

public class Circle extends Sheap{

	private Double radius;
	
	
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = Math.PI * (radius * radius);
		return area;
	}
}
