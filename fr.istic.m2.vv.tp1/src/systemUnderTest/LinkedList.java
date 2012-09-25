package systemUnderTest;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Linked list implementation of the List interface. Implements all optional
 * list operations, and permits all elements (including null. In addition to
 * implementing the List interface, the <tt>LinkedList</tt> class provides
 * uniformly named methods to get, remove and insert an element at the beginning
 * and end of the list. These operations allow linked lists to be used as a
 * stack, queue, or double-ended queue (deque).
 * 
 * All of the stack/queue/deque operations could be easily recast in terms of
 * the standard list operations. They're included here primarily for
 * convenience, though they may run slightly faster than the equivalent List
 * operations.
 * 
 * All of the operations perform as could be expected for a doubly-linked list.
 * Operations that index into the list will traverse the list from the begining
 * or the end, whichever is closer to the specified index.
 * <p>
 * 
 * 
 * The iterators returned by the this class's iterator and listIterator methods
 * are fail-fast: if the list is structurally modified at any time after the
 * iterator is created, in any way except through the Iterator's own remove or
 * add methods, the iterator will throw a ConcurrentModificationException. Thus,
 * in the face of concurrent modification, the iterator fails quickly and
 * cleanly, rather than risking arbitrary, non-deterministic behavior at an
 * undetermined time in the future.
 * 
 */

public class LinkedList extends AbstractSequentialList implements List {

	private Entry header = new Entry(null, null, null);
	private int size = 0;

	/**
	 * Constructs an empty list.
	 */
	public LinkedList() {
		header.next = header.previous = header;
	}

	/**
	 * Constructs a list containing the elements of the specified collection, in
	 * the order they are returned by the collection's iterator.
	 * 
	 * @param c
	 *            the collection whose elements are to be placed into this list.
	 */
	public LinkedList(Collection c) {
		this();
		addAll(c);
	}

	/**
	 * Returns the first element in this list.
	 * 
	 * @return the first element in this list.
	 */
	public Object getFirst() {
		if (size == 0)
			throw new NoSuchElementException();

//		return header.previous.element; //C'EST LOUCHE -->beug
		return header.next.element;
	}

	/**
	 * Returns the last element in this list.
	 * 
	 * @return the last element in this list.
	 * @throws NoSuchElementException
	 *             if this list is empty.
	 */
	public Object getLast() {
		if (size == 0)
			throw new NoSuchElementException();

		return header.previous.element; 
	}

	/**
	 * Removes and returns the first element from this list.
	 * 
	 * @return the first element from this list.
	 * @throws NoSuchElementException
	 *             if this list is empty.
	 */
	public Object removeFirst() {
		Object first = header.next.element;
		remove(header.next.next);
		return first;
	}

	/**
	 * Removes and returns the last element from this list.
	 * 
	 * @return the last element from this list.
	 * @throws NoSuchElementException
	 *             if this list is empty.
	 */
	public Object removeLast() {
		Object last = header.previous.element;
		remove(header.previous);
		return last;
	}

	/**
	 * Inserts the given element at the beginning of this list.
	 * 
	 * @param o
	 *            the element to be inserted at the beginning of this list.
	 */
	public void addFirst(Object o) {
		addBefore(o, header.next);
	}

	/**
	 * Appends the given element to the end of this list. (Identical in function
	 * to the <tt>add</tt> method; included only for consistency.)
	 * 
	 * @param o
	 *            the element to be inserted at the end of this list.
	 */
	public void addLast(Object o) {
		addBefore(o, header);
	}

	/**
	 * Returns <tt>true</tt> if this list contains the specified element. More
	 * formally, returns <tt>true</tt> if and only if this list contains at
	 * least one element <tt>e</tt> such that <tt>(o==null ? e==null
	 * : o.equals(e))</tt>.
	 * 
	 * @param o
	 *            element whose presence in this list is to be tested.
	 * @return <tt>true</tt> if this list contains the specified element.
	 */
	public boolean contains(Object o) {
		return indexOf(o) != -1;
	}

	/**
	 * Returns the number of elements in this list.
	 * 
	 * @return the number of elements in this list.
	 */
	public int size() {
		return size;
	}

	/**
	 * Appends the specified element to the end of this list.
	 * 
	 * @param o
	 *            element to be appended to this list.
	 * @return <tt>true</tt> (as per the general contract of
	 *         <tt>Collection.add</tt>).
	 */
	public boolean add(Object o) {
		addBefore(o, header);
		return true;
	}

	/**
	 * Removes the first occurrence of the specified element in this list. If
	 * the list does not contain the element, it is unchanged. More formally,
	 * removes the element with the lowest index <tt>i</tt> such that
	 * <tt>(o==null ? get(i)==null : o.equals(get(i)))</tt> (if such an element
	 * exists).
	 * 
	 * @param o
	 *            element to be removed from this list, if present.
	 * @return <tt>true</tt> if the list contained the specified element.
	 */
	public boolean remove(Object o) {
		if (o != null) {
			for (Entry e = header.next; e != header; e = e.next) {
				if (e.element.equals(o)) {  // == null --> .element.equals(o)
					remove(e);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Appends all of the elements in the specified collection to the end of
	 * this list, in the order that they are returned by the specified
	 * collection's iterator. The behavior of this operation is undefined if the
	 * specified collection is modified while the operation is in progress.
	 * (This implies that the behavior of this call is undefined if the
	 * specified Collection is this list, and this list is nonempty.)
	 * 
	 * @param c
	 *            the elements to be inserted into this list.
	 * 
	 * @throws IndexOutOfBoundsException
	 *             if the specified index is out of range (
	 *             <tt>index &lt; 0 || index &gt; size()</tt>).
	 */
	public boolean addAll(Collection c) {
		return addAll(size, c);
	}

	/**
	 * Inserts all of the elements in the specified collection into this list,
	 * starting at the specified position. Shifts the element currently at that
	 * position (if any) and any subsequent elements to the right (increases
	 * their indices). The new elements will appear in the list in the order
	 * that they are returned by the specified collection's iterator.
	 * 
	 * @param index
	 *            index at which to insert first element from the specified
	 *            collection.
	 * @param c
	 *            elements to be inserted into this list.
	 * @throws IndexOutOfBoundsException
	 *             if the specified index is out of range (
	 *             <tt>index &lt; 0 || index &gt; size()</tt>).
	 */
	public boolean addAll(int index, Collection c) {
		int numNew = c.size();
		if (numNew == 0)
			return false;
//		modCount++;

//		Entry successor = (index == size ? header : entry(index));
//		Entry predecessor = successor.previous;
//		Iterator it = c.iterator();
//		for (int i = 0; i < numNew; i++) {
//			Entry e = new Entry(it.next(), successor, predecessor);
//			predecessor.next = e;
//			predecessor = e;
//		}
//		successor.previous = predecessor;
		
		int i = index;
		
		for(Object o : c) {
			add(i, o);
			i++;
		}

		return true;
	}

	/**
	 * Removes all of the elements from this list.
	 */
	public void clear() {
		modCount++;
		header.next = header.previous = header;
		size = 0;
	}

	// Positional Access Operations

	/**
	 * Returns the element at the specified position in this list.
	 * 
	 * @param index
	 *            index of element to return.
	 * @return the element at the specified position in this list.
	 * 
	 * @throws IndexOutOfBoundsException
	 *             if the specified index is is out of range (
	 *             <tt>index &lt; 0 || index &gt;= size()</tt>).
	 */
	public Object get(int index) {
		return entry(index).element;
	}

	/**
	 * Replaces the element at the specified position in this list with the
	 * specified element.
	 * 
	 * @param index
	 *            index of element to replace.
	 * @param element
	 *            element to be stored at the specified position.
	 * @return the element previously at the specified position.
	 * @throws IndexOutOfBoundsException
	 *             if the specified index is out of range (
	 *             <tt>index &lt; 0 || index &gt;= size()</tt>).
	 */
	public Object set(int index, Object element) {
		Entry e = entry(index);
		Object oldVal = e.element;
		e.element = element;
		return oldVal;
	}

	/**
	 * Inserts the specified element at the specified position in this list.
	 * Shifts the element currently at that position (if any) and any subsequent
	 * elements to the right (adds one to their indices).
	 * 
	 * @param index
	 *            index at which the specified element is to be inserted.
	 * @param element
	 *            element to be inserted.
	 * 
	 * @throws IndexOutOfBoundsException
	 *             if the specified index is out of range (
	 *             <tt>index &lt; 0 || index &gt; size()</tt>).
	 */
	public void add(int index, Object element) {
		addBefore(element, (index == size ? header : entry(index)));
	}

	/**
	 * Removes the element at the specified position in this list. Shifts any
	 * subsequent elements to the left (subtracts one from their indices).
	 * Returns the element that was removed from the list.
	 * 
	 * @param index
	 *            the index of the element to removed.
	 * @return the element previously at the specified position.
	 * 
	 * @throws IndexOutOfBoundsException
	 *             if the specified index is out of range (
	 *             <tt>index &lt; 0 || index &gt;= size()</tt>).
	 */
	public Object remove(int index) {
		Entry e = entry(index);
		remove(e);
		return e.element;
	}

	/**
	 * Return the indexed entry.
	 */
	private Entry entry(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: "
					+ size);
		Entry e = header;
		if (index < size / 2) {
			for (int i = 0; i <= index; i++)
				e = e.next;
		} else {
			for (int i = size - 1; i >= index; i--) // ajout/correction: >= au lieu de > simple
				e = e.previous;
		}
		return e;
	}

	// Search Operations

	/**
	 * Returns the index in this list of the first occurrence of the specified
	 * element, or -1 if the List does not contain this element. More formally,
	 * returns the lowest index i such that
	 * <tt>(o==null ? get(i)==null : o.equals(get(i)))</tt>, or -1 if there is
	 * no such index.
	 * 
	 * @param o
	 *            element to search for.
	 * @return the index in this list of the first occurrence of the specified
	 *         element, or -1 if the list does not contain this element.
	 */
	public int indexOf(Object o) {
		int index = 0;
		if (o == null) {
			for (Entry e = header.next; e != header; e = e.next) {
				if (e.element == null)
					return index;
				index++;
			}
		} else {
			for (Entry e = header.next; e != header; e = e.next) {
				if (o.equals(e.element))
					return index;
				index++;
			}
		}
		return -1;
	}

	/**
	 * Returns the index in this list of the last occurrence of the specified
	 * element, or -1 if the list does not contain this element. More formally,
	 * returns the highest index i such that
	 * <tt>(o==null ? get(i)==null : o.equals(get(i)))</tt>, or -1 if there is
	 * no such index.
	 * 
	 * @param o
	 *            element to search for.
	 * @return the index in this list of the last occurrence of the specified
	 *         element, or -1 if the list does not contain this element.
	 */
	public int lastIndexOf(Object o) {
		int index = size;
		if (o == null) {
			for (Entry e = header.previous; e != header; e = e.previous) {
				index--;
				if (e.element == null)
					return index;
			}
		} else {
			for (Entry e = header.previous; e != header; e = e.previous) {
				index--;
				if (o.equals(e.element))
					return index;
			}
		}
		return -1;
	}

	/**
	 * Returns a list-iterator of the elements in this list (in proper
	 * sequence), starting at the specified position in the list. Obeys the
	 * general contract of <tt>List.listIterator(int)</tt>.
	 * <p>
	 * 
	 * The list-iterator is <i>fail-fast</i>: if the list is structurally
	 * modified at any time after the Iterator is created, in any way except
	 * through the list-iterator's own <tt>remove</tt> or <tt>add</tt> methods,
	 * the list-iterator will throw a <tt>ConcurrentModificationException</tt>.
	 * Thus, in the face of concurrent modification, the iterator fails quickly
	 * and cleanly, rather than risking arbitrary, non-deterministic behavior at
	 * an undetermined time in the future.
	 * 
	 * @param index
	 *            index of first element to be returned from the list-iterator
	 *            (by a call to <tt>next</tt>).
	 * @return a ListIterator of the elements in this list (in proper sequence),
	 *         starting at the specified position in the list.
	 * @throws IndexOutOfBoundsException
	 *             if index is out of range (
	 *             <tt>index &lt; 0 || index &gt; size()</tt>).
	 * @see List#listIterator(int)
	 */
	public ListIterator listIterator(int index) {
		return new ListItr(index);
	}

	private class ListItr implements ListIterator {
		private Entry lastReturned = header;
		private Entry next;
		private int nextIndex;
		private int expectedModCount = modCount;

		ListItr(int index) {
			if (index < 0 || index > size)
				throw new IndexOutOfBoundsException("Index: " + index
						+ ", Size: " + size);
			if (index < size / 2) {
				next = header.next;
				for (nextIndex = 0; nextIndex < index; nextIndex++)
					next = next.next;
			} else {
				next = header;
				for (nextIndex = size; nextIndex > index; nextIndex--)
					next = next.previous;
			}
		}

		public boolean hasNext() {
			return nextIndex != size;
		}

		public Object next() {
			checkForComodification();
			if (nextIndex == size)
				throw new NoSuchElementException();

			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.element;
		}

		public boolean hasPrevious() {
			return nextIndex != 0;
		}

		public Object previous() {
			if (nextIndex == 0)
				throw new NoSuchElementException();

			lastReturned = next = next.previous;
			nextIndex--;
			checkForComodification();
			return lastReturned.element;
		}

		public int nextIndex() {
			return nextIndex;
		}

		public int previousIndex() {
			return nextIndex - 1;
		}

		public void remove() {
			LinkedList.this.remove(lastReturned);
			if (next == lastReturned)
				next = lastReturned.next;
			else
				nextIndex--;
			lastReturned = header;
			expectedModCount++;
		}

		public void set(Object o) {
			if (lastReturned == header)
				throw new IllegalStateException();
			checkForComodification();
			lastReturned.element = o;
		}

		public void add(Object o) {
			checkForComodification();
			lastReturned = header;
			addBefore(o, next);
			nextIndex++;
			expectedModCount++;
		}

		final void checkForComodification() {
			if (modCount != expectedModCount)
				throw new ConcurrentModificationException();
		}
	}

	private static class Entry {
		Object element;
		Entry next;
		Entry previous;

		Entry(Object element, Entry next, Entry previous) {
			this.element = element;
			this.next = next;
			this.previous = previous;
		}
	}

	private Entry addBefore(Object o, Entry e) {
		Entry newEntry = new Entry(o, e, e.previous);
		newEntry.previous.next = newEntry;
		newEntry.next.previous = newEntry;
		size++;
		modCount++;
		return newEntry;
	}

	private void remove(Entry e) {
		if (e == header)
			throw new NoSuchElementException();

		e.previous.next = e.next;
		e.next.previous = e.previous; // ajout

		size--;
		modCount++;
	}
}
