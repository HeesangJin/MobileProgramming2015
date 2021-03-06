package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	//Implement here
	private int w;
	private int h;
	
	Rectangle(Point center,int w, int h){
		this.w = w;
		this.h = h;
		this.center = center;
		
	}
	public int getWidth(){
		return w;
	}
	public int getHeight(){
		return h;
	}
	
	public Rectangle getBounds() {
		return this;
	}
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}
}
