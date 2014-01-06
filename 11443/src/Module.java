import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;

import org.newdawn.slick.opengl.Texture;

public abstract class Module {
	private Position position;
	private int hit_points; // wrecked
	private int structure_points; // annihilated
	private int mass;
	private String filename; // lolcat.jpg
	private Image image;
	private int moduleType;
	private Texture texture;

	public Module(Position position, int hit_points, int structure_points,
		int mass, int moduleType, String filename) {
		this.position = position;
		this.hit_points = hit_points;
		this.structure_points = structure_points;
		try {
			this.texture = Displayen.loadImage(filename);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.moduleType = moduleType;
	}

	public int getType() {
		return moduleType;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public int getHit_points() {
		return this.hit_points;
	}

	public int getStructure_points() {
		return this.structure_points;
	}

	public int getMass() {
		return this.mass;
	}

	public void setTexture(String filename) throws IOException {
		this.texture = Displayen.loadImage(filename);
	}
	
	public void renderModule(Texture texture, int x, int y, int angle) {
		Displayen.makeQuad(texture, x, y, angle);
	}

}
