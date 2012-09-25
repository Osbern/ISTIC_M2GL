package auction;

public interface Account {

	public abstract String decCredit(int amount);

	public abstract int getCredit();

	public abstract String getCredits();

	public abstract int getFreeCredit();

	public abstract String incCredit(int amount);

}