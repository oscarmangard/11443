public class EditorGrid {
	int size = 100;
	public boolean[] array = new boolean[size];
	
	public EditorGrid(Command_Module module){
		this.size *= module.getSizeMult();
	}
}
