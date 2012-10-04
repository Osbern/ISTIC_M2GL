package auction;

public interface Command {
	public abstract String execute(String canal, String params);		
}
