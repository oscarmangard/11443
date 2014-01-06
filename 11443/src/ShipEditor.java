
public class ShipEditor {

	private SpaceCraft craft;
	private Module currentModule; //senast klickade modulen
	private Position mousePosition;
	
	private void clickedModule(){
		//currentModule=klickad grej i ui
	}
	
	private void placeModule(){
		currentModule.setPosition(mousePosition);
		craft.addModule(currentModule, currentModule.getType());
		updateData();
	}

	private void removeModule(){

	}
	
	
	private void newShip(){
		SpaceCraft craft = new SpaceCraft();
	}
	private void updateData(){ //total thrust, mass etc och rita nya skeppet
		
	}
	private void saveShip(){
		//save to file
	}
	
	
}
