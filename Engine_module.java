
public class Engine_module extends Module {
	private double thrust;
	private double fuelCon;
	
	public Engine_module(Position position, int hit_points, int structure_points, int mass, double thrust, double fuelCon) {
		super(position, hit_points, structure_points, mass);
		this.thrust=thrust;
		this.fuelCon=fuelCon;
		
	}

	
}
