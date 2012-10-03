package auction.impl;

import java.util.List;

import auction.BulletinBoard;
import auction.Message;
import auction.Moderator;
import auction.Person;

public class BulletinBoardImpl implements BulletinBoard {

	private List<MessageImpl> messages = new java.util.ArrayList<MessageImpl>();

	public String delMessage(Person p, int num) {
		if(!(p instanceof Moderator))
			return "ERROR: only moderators can delete a message";
		if(num<1 || num>messages.size())
			return "ERROR: this message does not exist";
		messages.remove(num-1);
		return "OK";
	}

	public String getMess(){
		StringBuffer result = new StringBuffer();
		int size = messages.size();
		if(size>0) {
			Message m = messages.get(0);
			result.append("1 "+m);
		}
		for(int i = 1;i<size;++i) {
			result.append(System.getProperty("line.separator"));
			Message m = messages.get(i);
			result.append(Integer.toString(i+1)+" "+m);
		}
		return result.toString();
	}

	public List<MessageImpl> getMessages() {
		return messages;
	}

}
