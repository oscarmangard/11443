
import java.io.IOException;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
public class Main {
	public static void main(String[] argv) throws IOException{
		System.setProperty("org.lwjgl.opengl.Window.undecorated","true");
		Displayen.initGL(1920, 1080);
		Displayen displayen = new Displayen();
		gameLoop();
		
	}

	public static void gameLoop() {
		while (true) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
			Displayen.render();
			
			Display.update();
			
			if (Display.isCloseRequested()) {
				Display.destroy();
				System.exit(0);
			}
		}
	}
}
