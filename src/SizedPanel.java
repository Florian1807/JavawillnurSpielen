import javax.swing.*;

import util.ShowInFrame;

import java.awt.Dimension;
public class SizedPanel extends JPanel{

	int preferredWidth=500;
	int preferredHeight=500;
	
	public SizedPanel(int w, int h) {
		preferredWidth=w;
		preferredHeight=h;
	}
	public SizedPanel() {}
	
	@Override public Dimension getPreferredSize() {
		return new Dimension(preferredWidth,preferredHeight);}
	
	
 public static void main(String[] args) {
	 ShowInFrame.show(new SizedPanel());

}
}