import java.awt.event.*
import static java.awt.event.KeyEvent;

import util.*;


public class KeyControlledAnimation {
KeyControlledAimation(final GameObject contr){
	super(contr);
	addKeyListener( new KeyAdapter() {
		public void keyPressed(KeyEvent e)
	}
}
	public static void main(String[] args) {
		switch(e.getKeyCode()) {
		case VK_LEFT:
			controlled.getDeltaPos().addmod(new Vertex( 0.5, 0));
			switch (e.getKeyCode()) {
			case VK_LEFT:
			controlled.getDeltaPos() . addMod(new Vertex(-O.5,O));
			break;
			case VK_RIGHT:
			controlled.getDeltaPos() . addMod(new Vertex(O.5,O));
			break;
			case VK_UP:
			controlled.getDeltaPos() . addMod(new Vertex(O,-O.5));
			break;
			case VK_DOWN:
			controlled.getDeltaPos() . addMod(new Vertex(O,O.5));
			break;
		}
	}
});
	
	
	setFocusable (true) ;
 requestFocusInWindow();
}

public static void main(String[] args) {MovableImage
	MovablePanel p = new KeyControlledAnimation
	 (new Movablelmage("hexe.png",O,O,1,1));
	 p.gos.add(new MovableImage("biene.png",200,200,-1,-1));
	 ShowInFrame.show(p);
}
}

