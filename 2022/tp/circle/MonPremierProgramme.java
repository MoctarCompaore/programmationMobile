class Circle {
	public double x, y; // coordonnées du centre
	private double r; // rayon du cercle
	public Circle(double r) {
		this.r = r;
	}
	public double area() {
		return 3.14159 * r * r;
	}
}

public class MonPremierProgramme {
	public static void main(String[] args) {
		Circle c; // c est une référence sur un objet de type Circle, pas encore un objet
		c = new Circle(Double.parseDouble(args[0])); // c référence maintenant un objet alloué en mémoire
		c.x = c.y = 10;  // ces valeurs sont stockées dans le corps de l’objet
		System.out.println("Aire de c :" + c.area());
	}
}