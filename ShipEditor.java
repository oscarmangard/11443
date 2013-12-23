
public class ShipEditor {

	private SpaceCraft craft;
	private Module currentModule; //senast klickade modulen
	
	private void placeModule(){
		craft.addModule(currentModule, currentModule.getType());
	}
	
	private void newShip(){
		SpaceCraft craft = new SpaceCraft();
	}
	
	
	
	
}
