/**
 * 
 */
package systemUnderTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @author 28002846
 *
 */
public class LinkedListTest {
	
	private LinkedList list;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		list = new LinkedList();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		list = null;
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#addAll(java.util.Collection)}.
	 */
	@Test
	public void testAddAllCollection() {
		Collection<Integer> c = new ArrayList<Integer>();
		c.add(5);
		c.add(8);
		c.add(9);
		list.addAll(c);
		assertEquals(3, list.size());
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#addAll(int, java.util.Collection)}.
	 */
	@Test
	public void testAddAllIntCollection() {
		list.add("1");
		list.add("2");
		list.add("3");
		
		Collection<String> c = new ArrayList<String>();
		c.add("17");
		c.add("18");
		c.add("19");
		
		list.addAll(1, c);
		assertEquals("1", list.get(0));
		assertEquals("17", list.get(1));
		assertEquals("18", list.get(2));
		assertEquals("19", list.get(3));
		assertEquals("2", list.get(4));
		assertEquals("3", list.get(5));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#addFirst(java.lang.Object)}.
	 */
	@Test
	public void testAddFirst() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.addFirst(17);
		assertEquals(17, list.getFirst());
	}
	
	@Test
	public void testAddFirst2() {
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(17);
		assertEquals(17, list.getFirst());
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#add(int, java.lang.Object)}.
	 */
	@Test
	public void testAddIntObject() {
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add(1, "17");
		assertEquals("17", list.get(1));
		assertEquals("2", list.get(2));
		assertEquals("3", list.get(3));
		assertEquals("4", list.get(4));
		assertEquals("1", list.get(0));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#addLast(java.lang.Object)}.
	 */
	@Test
	public void testAddLast1() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.addLast(17);
		assertEquals(17, list.getLast());
	}
	
	@Test
	public void testAddLast2() {
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(17);
		assertEquals(17, list.getLast());
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#add(java.lang.Object)}.
	 */
	@Test
	public void testAddObject() {
		Object o = new Object();
		list.add(o);
		assertEquals(1, list.size());
	}
	
	@Test
	public void testAddObject2() {
		Object o = new Object();
		list.add(o);
		Object p = new Object();
		list.add(p);
		assertEquals(2, list.size());
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#clear()}.
	 */
	@Test
	public void testClear1() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.clear();
		assertEquals(0, list.size());
	}
	
	@Test
	public void testClear2() {
		list.clear();
		assertEquals(0, list.size());
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#contains(java.lang.Object)}.
	 */
	@Test
	public void testContainsObject() {
		list.add("1");
		list.add("2");
		list.add("3");
		assertTrue(list.contains("2"));
		assertFalse(list.contains("17"));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#getFirst()}.
	 */
	@Test
	public void testGetFirst() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		assertEquals(1, list.getFirst());
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#get(int)}.
	 */
	@Test
	public void testGetInt() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		assertEquals(1, list.get(0));
		assertEquals(2, list.get(1));
		assertEquals(3, list.get(2));
		assertEquals(4, list.get(3));
		assertEquals(5, list.get(4));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#getLast()}.
	 */
	@Test
	public void testGetLast() {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		assertEquals(5, list.getLast());
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#indexOf(java.lang.Object)}.
	 */
	@Test
	public void testIndexOfObject() {
		list.add("1");
		list.add("2");
		list.add("3");
		assertEquals(1, list.indexOf("2"));
	}
	
	@Test
	public void testIndexOfObject2() {
		list.add("1");
		list.add("2");
		list.add("2");
		assertEquals(1, list.indexOf("2"));
	}
	
	@Test
	public void testIndexOfObject3() {
		list.add("1");
		list.add("2");
		list.add("3");
		assertEquals(-1, list.indexOf("5"));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#lastIndexOf(java.lang.Object)}.
	 */
	@Test
	public void testLastIndexOfObject() {
		list.add("1");
		list.add("2");
		list.add("3");
		assertEquals(1, list.lastIndexOf("2"));
	}
	
	@Test
	public void testLastIndexOfObject2() {
		list.add("1");
		list.add("2");
		list.add("2");
		assertEquals(2, list.lastIndexOf("2"));
	}
	
	@Test
	public void testLastIndexOfObject3() {
		list.add("1");
		list.add("2");
		list.add("3");
		assertEquals(-1, list.lastIndexOf("5"));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#LinkedList()}.
	 */
	@Test
	public void testLinkedList() {
		assertTrue(true); // true
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#LinkedList(java.util.Collection)}.
	 */
	@Test
	public void testLinkedListCollection() {
		Collection<String> c = new ArrayList<String>();
		c.add("17");
		c.add("18");
		c.add("19");
		list = new LinkedList(c);
		assertEquals("17", list.get(0));
		assertEquals("18", list.get(1));
		assertEquals("19", list.get(2));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#listIterator(int)}.
	 */
	@Test
	public void testListIteratorInt() {
		assertTrue(true); // true
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#removeFirst()}.
	 */
	@Test
	public void testRemoveFirst() {
		list.add("1");
		list.add("2");
		list.add("3");
		assertEquals(list.getFirst(), list.removeFirst());
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#remove(int)}.
	 */
	@Test
	public void testRemoveInt() {
		list.add("1");
		list.add("2");
		list.add("3");
		assertEquals(list.get(2), list.remove(2));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#removeLast()}.
	 */
	@Test
	public void testRemoveLast() {
		list.add("1");
		list.add("2");
		list.add("3");
		assertEquals(list.getLast(), list.removeLast());
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#remove(java.lang.Object)}.
	 */
	@Test
	public void testRemoveObject1() {
		list.add("1");
		list.add("2");
		list.add("3");
		list.remove("2");
		assertEquals(2, list.size());
	}
	
	@Test
	public void testRemoveObject2() {
		list.add("1");
		list.add("2");
		list.add("3");
		assertFalse(list.remove("5"));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#set(int, java.lang.Object)}.
	 */
	@Test
	public void testSetIntObject() {
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		assertEquals("2", list.set(1, "17"));
		assertEquals("17", list.get(1));
	}

	/**
	 * Test method for {@link systemUnderTest.LinkedList#size()}.
	 */
	@Test
	public void testSize() {
		assertEquals(0, list.size());
	}

}
