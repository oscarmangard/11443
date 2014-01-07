
public class Command_Module extends Module {

	private int sizeMult;
	
	public Command_Module(Position position, int hit_points,int structure_points, int mass, int moduleType, String filename, int sizeMult) {
		super(position, hit_points, structure_points, mass, moduleType, filename);
		
		this.sizeMult = sizeMult;
	}
	
	public int getSizeMult(){
		return sizeMult;
	}
	

}
