import java.awt.Color;

public class SimpleTriangle extends GeometricObject {

//pushy

	public SimpleTriangle(double w, double h, Vertex pos, Color color) {
		super(w, h, pos, color);

	}

	public SimpleTriangle(double w, double h, double x, double y) {
		super(w, h, new Vertex(x, y), new Color(0,0,0));
	}

	@Override
	public double area() {
		return width * height / 2;
	}

	@Override
	public String toString() {
		return "SimpleTriangle (" + super.toString() + ")";
	}

	@Override
	public boolean equals(Object that) {
		return (that instanceof SimpleTriangle) && super.equals(that);
	}
}
//
