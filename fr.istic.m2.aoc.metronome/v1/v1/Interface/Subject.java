package v1.Interface;

/**
 * @(#) Subject.java
 */

public interface Subject {
	void attach(Observer o);

	void detach(Observer o);

	void notifyObs();

}
