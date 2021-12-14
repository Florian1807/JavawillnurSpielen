
public class Vertex {// Typ Vertex erstellen
	public double x;
	public double y;

	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {

		return "x = " + x + ", y = " + y;
	}

	public double length() {
		return Math.sqrt(x * x + y * y);

	}

	public Vertex skalarMult(double s) {

		return new Vertex(x * s, y * s);
	}

	public void skalarMultMod(double s) {
		x = s * x;
		y = s * y;

	}

	public Vertex add(Vertex v2) {// Addieren
		return new Vertex(x + v2.x, y + v2.y);
	}

	public void addMod(Vertex v2) {
		x = x + v2.x;
		y = y + v2.y;
	}

	public Vertex sub(Vertex v2) {// Subtrahieren
		return new Vertex(x - v2.x, y - v2.y);

	}

	public double distance(Vertex v2) {// Distanzberechnung
		double a = v2.x - this.x;
		double b = v2.y - this.y;
		return Math.sqrt(a * a + b * b);// Satz des Pythagoras

	}

	public void normalize() {
		double factor = this.length();
		x = x / factor;
		y = y / factor;
	}

	public void setX(double x) {

		this.x = x;
	}

	public void setY(double y) {

		this.y = y;
	}

	public double getX() {// Rückgabe

		return x;
	}

	public double getY() {// Rückgabe

		return y;
	}

	public boolean equals(Object thatObjekt) {// Gleichheitscheck

		if (thatObjekt instanceof Vertex) {// Ist die Variable vom Typ Vertex?
			Vertex that = (Vertex) thatObjekt;
			return this.x == that.x && this.y == that.y;
		} else {// kann man auch weglassen
			return false;// Rückgabe
		}
	}
}