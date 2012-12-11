package yetihelp;

public class Helper {
	
	public int dummyLeet() {
		return 1337;
	}
	
	public Character dummyCharacter(char c) {
		return new Character(c);
	}
	
	public int dummyOver9000() {
		return 9001;
	}
	
	public Boolean dummyBool(boolean b) {
		return new Boolean(b);
	}
	
	public String cleverString(int v) {
		if (v >= 10000)
			return "print_color";
		else
			return "start";
	}
}
