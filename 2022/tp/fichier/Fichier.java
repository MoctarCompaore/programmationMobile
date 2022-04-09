//import java.io.IOException;
import java.io.*;    // nouveau


public class Fichier { // nouveau
    public static BufferedReader  input;
    
    public static void main(String[] args) {
        ouvrir_fichier("liste_mots");
        traiter_fichier();
        fermer_fichier();
        }
    public static void ouvrir_fichier(String nom) {
            try { 
            input = new BufferedReader(
                        new FileReader(nom));
        }
        catch (IOException e) {
            System.err.println("Impossible   d'ouvrir le fichier d'entree.\n" + e.toString());
            System.exit(1);
        }
    }  
        public static void traiter_fichier() {
        String ligne;
        int compteur =0 ;//--- nouveau
        try { // catch EOFException		
            ligne = input.readLine();

            while (ligne != null) {
            System.out.println(compteur+++": " +ligne); //
            ligne = input.readLine();
            }
           
        }
         catch (IOException e) {
            System.err.println("Impossible de lire  le fichier.\n" + e.toString());
        }
    }
    public static void fermer_fichier() {
        try {
            input.close();
            System.exit(0);
        }
        catch (IOException e) {
            System.err.println("Impossible de fermer les fichiers.\n" + e.toString());
        }
    }

} // nouveau
