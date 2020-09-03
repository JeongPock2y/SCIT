package lwc131;

abstract public class Shape implements Movable{
	int x,y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
};

	
	


