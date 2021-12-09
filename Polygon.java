
public class Polygon extends Shape{

	private float side;
	private float apotema;
	
	public Polygon(String Polygon, float side, float apotema) {
		super(Polygon);
		this.apotema = apotema;
		this.side = side;
	}

	public String toString() {
		return "Polygon[side=" + side + ",apotema=" + apotema + "," + super.toString() + "]";
	}
	
	public float getArea() {
		return (float) (6*side);
	}
}
