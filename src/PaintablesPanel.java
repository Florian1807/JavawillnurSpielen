import java.util.*;

import util.ShowInFrame;

public class PaintablesPanel extends SizedPanel{
List<Paintable> pas;
public PaintablesPanel(List<Paintable>pas) {this.pas=pas;}
public void paintComponent(java.awt.Graphics g) {
	for(Paintable pa:pas) pa.paintTo(g);
}
public static void main(String[] args) {
	List<Paintable> ps = new ArrayList<Paintable>();
	ps.add(new SimplePaintableRectangle(100,50,30,50));
	ps.add(new SimplePaintableRectangle(100,50,80,100));
	ps.add(new SimplePaintableRectangle(100,50,130,150));
	ps.add(new SimplePaintableRectangle(100,50,180,200));
	ps.add(new SimplePaintableRectangle(100,50,230,250));
	ps.add(new SimplePaintableRectangle(100,50,280,300));
	ShowInFrame.show("Treppe", new PaintablesPanel(ps));
}
}
