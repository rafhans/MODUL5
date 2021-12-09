
public class Rectangle extends Shape{
	private float length, width;
	
	public Rectangle(String Rectangle, int length, int width) {
		super(Rectangle);
		this.length = length;
		this.width = width;
	}
	
	public String toString() {
		return "Rectangle[length=" + length + ", width=" + width + "," +super.toString() +"]";		
	}
	
	public float getArea() {
		return (float) (length*width);
	}
	
	public float circum() {
		return (float) (2*(length*width));
	}
	
	@Override
	public void draw() {
		System.out.println("Menggambar Lingkaran");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		
	}

  
}
