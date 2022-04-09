public class Factorielle
{
	public static double factorielle(int x) {
		if (x < 0) return 0.0;
		double fact = 1.0;
		while (x > 1) {
		      fact = fact * x;
		      x = x - 1;
		}
		return fact;
	}

	public static void main(String[] args) {
		int entree = Integer.parseInt(args[0]);
		double resultat = factorielle(entree);
		System.out.println(entree+" ! = "+resultat);
	}
}
