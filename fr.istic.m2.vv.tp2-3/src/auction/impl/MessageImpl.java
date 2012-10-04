package auction.impl;

import auction.BulletinBoard;
import auction.Message;
import auction.Person;


public class MessageImpl implements Message {

	private Person author;

	private BulletinBoard bulletinBoard;

	private String message;

	public MessageImpl(BulletinBoardImpl bulletinBoard, Person person, String message) {
		this.author = person;
		this.bulletinBoard = bulletinBoard;
		this.message = message;
		bulletinBoard.getMessages().add(this);
	}

	/* (non-Javadoc)
	 * @see auction.impl.Message#getAuthor()
	 */
	public Person getAuthor() {
		return author;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Message#getBulletinBoard()
	 */
	public BulletinBoard getBulletinBoard() {
		return bulletinBoard;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Message#getMessage()
	 */
	public String getMessage() {
		return message;
	}

	/* (non-Javadoc)
	 * @see auction.impl.Message#toString()
	 */
	public String toString() {
		return author.getEmail()+" "+message;
	}

}
