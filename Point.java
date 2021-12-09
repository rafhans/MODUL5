
public class Point {
	private int x,y;
	public Point(int xCenter, int yCenter) {
		this.x=0;
		this.y=0;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public String toString() {
		return "(" +this.x+ "," +this.y+ ")";
	}
}
