public class Personne {
	public String nom;
	public int anneeNaissance;
	public int age() {return 2022 - anneeNaissance; }
}
class Utilisation {
	public static void main(String[] args) { 
		Personne qui;
		qui = new Personne();
		qui.nom = args[0];
		qui.anneeNaissance = Integer.parseInt(args[1]);
		System.out.println(qui.nom+" a " + qui.age() +" ans ");
	}
}