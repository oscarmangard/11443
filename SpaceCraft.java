import java.awt.List;
import java.util.ArrayList;


public class SpaceCraft {

	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// skeppets specifikationer, moduler etc ///////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private  ArrayList<ArrayList<Module>> modules=new ArrayList<ArrayList<Module>>();
	//borde egentligen vara en array av listor men det verkar kasst i java.
	
	private static final int engines=0; 
	private static final int hulls=1; 
	private static final int guns=2;
	private static final int etc= 3;
	
	public SpaceCraft(){
		for(int i=0; i<3; i++){
			modules.get(i).addAll(new ArrayList<Module>()); //fyll på listan med listor
		}
	}
	
	private void exampleShip(){	
		modules.get(engines).add( new Engine_module((new Position(1,3)),  10, 20, 10, "lolcat.jpg", 13.37, 7.5));
		//etc
	}
	public void addModule(Module module, int moduleType){ 
		modules.get(moduleType).add(module);
	}														   
															   
	private double updateAcceleration(){
		double boost=1337; //gib code :(
		return boost;
	}
	

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// styrning och ai för flygningen     ///////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	private double acceleration;
	private ShipPosition shipPosition;
		
	public int getX(){
		return shipPosition.getX();
	}
	public int getY(){
		return shipPosition.getY();
	}

	private void drawShip(){
		for(int i = 0; i < modules.size(); i++){
			for(int j = 0; i < modules.get(i).size(); j++){
				// code plix
			}
		}
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	// skeppets interiör, karaktärer      ///////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	private ArrayList<Character> folks = new ArrayList<Character>();
	
	
	private void addPerson(Character person){
		folks.add(person);
	}
	private void removePerson(int index){
		folks.remove(index);
	}
	
	
	
	
	
	
}
