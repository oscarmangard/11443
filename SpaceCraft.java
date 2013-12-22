
public class SpaceCraft {
	public Module[][] modules;
	
	private int engines=0;
	private int hulls=1;
	private int guns=2;
	
	
	private double acceleration;
	private ShipPosition shipPosition;
		
	public SpaceCraft(int x, int y){
		this.shipPosition.setX(x);
		this.shipPosition.setY(y);
	}
	private void exampleShip(){
		modules[engines][0]= new Engine_module((new Position(1,3)),  10, 20, 10, 13.37, 7.5);
		//etc
	}
	private void addModule(){ // skriv haer
		
	}
	
	private double updateAcceleration(){
		double boost=1337; //gib code :(
		return boost;
	}
	
	private void drawShip(){
		for(int i = 0; i < 3; i++){
			for(int j = 0; i < modules[i].length; j++){
				// code plix
			}
		}
	}
	
	public int getX(){
		return shipPosition.getX();
	}
	public int getY(){
		return shipPosition.getY();
	}
	
}
