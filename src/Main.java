import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		Vertex v1 = new Vertex(5, 5);
		//SimpleOval ov1 = new SimpleOval(17, 4, new Vertex(42, 23));

		SimpleRectangle r1 = new SimpleRectangle(17, 4, 4, 4);

		// System.out.println(r1.equals(ov1));

		//System.out.println(ov1);

		JFrame f = new JFrame("HelloWorld!");
		f.setVisible(true);

	}

}
