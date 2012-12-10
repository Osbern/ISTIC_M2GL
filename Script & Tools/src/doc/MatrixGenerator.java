package doc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MatrixGenerator {

	private static void genMat(int size) {
		File f = new File("Matrix.txt");
		// on va chercher le chemin et le nom du fichier et on me tout ca dans
		// un String
		String adressedufichier = f.getPath();

		// on met try si jamais il y a une exception
		try {
			FileWriter fw = new FileWriter(adressedufichier, false);

			// le BufferedWriter output auquel on donne comme argument le
			// FileWriter fw cree juste au dessus
			BufferedWriter output = new BufferedWriter(fw);

			Random r = new Random();

			output.write(gen2Mat(size, r));


			output.flush();

			output.close();
			System.out.println("fichier créé");
		} catch (IOException ioe) {
			System.out.print("Erreur : ");
			ioe.printStackTrace();
		}

	}
/**
 * 
 * @param size la taille des 2 matrices
 * @param r le générateur d'aléatoire
 * @return 2 matrice accolées (séparées par "tab | tab")
 */
	private static String gen2Mat(int size, Random r) { 
		String s = "";
		for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) { // 1 ligne (matrice 1)
					s = s + r.nextInt(50) + "\t";
				}
				s += "\t|\t";
				for (int j = 0; j < size; j++) { // 1 ligne (matrice 2)
					s = s + r.nextInt(50) + "\t";
				}
			s +="\n";
		}

		return s;
	}

	public static void main(String[] args) {
		genMat(100);
	}
}
