import java.awt.Image;

import javax.swing.ImageIcon;


public class Module {
	private Position position;
	private int hit_points; //wrecked
	private int structure_points; //annihilated
	private int mass;
	private String filename; //lolcat.jpg
	private Image image;
		
	public Module(Position position,  int hit_points, int structure_points, int mass, String filename){
		this.position=position;
		this.hit_points=hit_points;
		this.structure_points=structure_points;
		this.filename=filename;
	}
	
	public Position getPosition(){
		return position;
	}
	
	public int getHit_points(){
		return this.hit_points;
	}
	
	public int getStructure_points(){
		return this.structure_points;
	}

	public int getMass(){
		return this.mass;
	}
	public void setPicture(String filename){
		this.filename=filename;
	}

	public Image getImage(){
        ImageIcon ii = new ImageIcon(this.getClass().getResource(filename));
        image = ii.getImage();
        return image;
	}
	
	
}

























