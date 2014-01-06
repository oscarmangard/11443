
public class ShipPosition {
	private int angle;
	private int x;
	private int y;
	private double xDelta;
	private double yDelta;

	public ShipPosition(int x, int y,int angle, double xDelta, double yDelta){
		this.angle=angle;
		this.x=x;
		this.y=y;
		this.xDelta=xDelta;
		this.yDelta=yDelta;
		
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public double getDeltaX(){
		return this.xDelta;
	}
	public double getDeltaY(){
		return this.yDelta;
	}
	public int getAngle(){
		return this.angle;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setDeltaX(double dx){
		this.xDelta=dx;
	}
	public void setDeltaY(double dy){
		this.yDelta=dy;
	}
	public void setAngle(int angle){
		this.angle=angle;
	}
}
