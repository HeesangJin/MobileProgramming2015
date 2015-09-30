package kr.ac.kookmin.shape;

public abstract class Shape {
    protected Point center;
//Implement here
    
    public Point getCenter(){
    	return center;
    }
    abstract public Rectangle getBounds();
    
    
    abstract public void draw(Graphics g);
    abstract public String toString();
}