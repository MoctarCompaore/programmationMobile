
public class Interet{
	public static void main(String[] args){
		System.out.println(" Le nombre d'années : "
                            + nombreAnnees( 
                             Double.parseDouble(args[0]),
                             Double.parseDouble(args[1]),
			     Double.parseDouble(args[2])
			    )
		);


	}

	public static int nombreAnnees(double balance, double targetBalance, double rate){
		int  years =0 ;
 		while (balance<targetBalance) {
			years++;
			double interest = balance * rate;
			balance += interest; 

		}
			
           return years;

	}

}