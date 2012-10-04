package auction;


public interface Message {

	public abstract Person getAuthor();

	public abstract BulletinBoard getBulletinBoard();

	public abstract String getMessage();

	public abstract String toString();

}