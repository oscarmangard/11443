
public class Engine_module extends Module {
	private double thrust;
	private double fuelCon;
	private static int moduleType=0;
	
	public Engine_module(Position position, int hit_points, int structure_points, int mass, String filename,double thrust, double fuelCon) {
		super(position, hit_points, structure_points, mass, moduleType, filename);
		this.thrust=thrust;
		this.fuelCon=fuelCon;
		
	}

	
}
