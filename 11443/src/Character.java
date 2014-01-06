import java.util.ArrayList;


public class Character { //låg prio
	private boolean dead;
	private int hp;
	private int speed;
	private boolean niceGuy;
	private ArrayList<Possesion> inventory = new ArrayList<Possesion>();	
	private int[] appearance = new int[5]; //facenumber, bodynumber,legnumber, etcnumber   
	
	public Character(){
		dead=false;
	}
	
	public void setBadGuy(boolean niceness){
		niceGuy=niceness;
	}
	
	public boolean dealtDamage(int damage){
		hp=hp-damage;
		if(hp<=0){
			dead=true;
		}
		return dead;
	}
	
	public ArrayList<Possesion> getInventory(){
		return inventory;
	}
	
	public void drawCharacter(){
		
	}
}
