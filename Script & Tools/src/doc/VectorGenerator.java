package doc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class VectorGenerator {

	private static void genVect(int nbLigne){
		File f = new File("Resultat.txt");
		//on va chercher le chemin et le nom du fichier et on me tout ca dans un String
		String adressedufichier = f.getPath();
	
		//on met try si jamais il y a une exception
		try
		{
			FileWriter fw = new FileWriter(adressedufichier, false);
			
			// le BufferedWriter output auquel on donne comme argument le FileWriter fw cree juste au dessus
			BufferedWriter output = new BufferedWriter(fw);
			
			String s = "";
			Random r = new Random();
			for(int i = 0; i<nbLigne; i++){
				s = r.nextInt(50)+"\t"+r.nextInt(50)+"\n";
				output.write(s);
			}
			output.flush();
			
			output.close();
			System.out.println("fichier créé");
		}
		catch(IOException ioe){
			System.out.print("Erreur : ");
			ioe.printStackTrace();
			}
		
	}
	
	public static void main(String[] args) {
	genVect(1500);
}
}
