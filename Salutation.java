
public class Salutation {

	public static void main(String[] args){

		int age;
		age = Integer.parseInt(args[0]);
	
		//Afficher ubne salutation selon l'age 
		System.out.println(" Salut , le ");
		if( age < 65 ) 

			System.out.println(" Jeune ");
		else 
			System.out.println(" Vieux ");

	}
}