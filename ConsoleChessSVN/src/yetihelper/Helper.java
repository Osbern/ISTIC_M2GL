package yetihelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import material.Piece;
import material.Square;

public class Helper {

	public static Integer dummyInteger(int i) {
		return new Integer(i);
	}
	
	public static Boolean dummyBool(boolean b) {
		return new Boolean(b);
	}
	
	public String smartString() {
		Random r = new Random();
		String[] line = { "a", "b", "c", "d", "e", "f", "g", "h"};
		
		return line[r.nextInt(8)] + (r.nextInt(8) + 1) + " " + line[r.nextInt(8)] + (r.nextInt(8) + 1);
	}
	
	public static List<Integer> smartList() {
		List<Integer> lst = new ArrayList<Integer>();
		Random r = new Random();
		int i = r.nextInt(100);
		
		for (int j = 0; j < i; j++) {
			lst.add(r.nextInt(9000));
		}
		return lst;
	}
	
	public static Piece dummyPiece() {
		return new Piece(new Square(smartList()), "B", "w");
	}
}
