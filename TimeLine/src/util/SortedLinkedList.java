/**
 * 
 */
package util;

import java.util.LinkedList;

/**Sorted array list stores objects and uses their
 * compareTo methods to determine their order in the list.
 * @author Rafael Zingle
 *
 */
public class SortedLinkedList<E extends Comparable<E>> extends LinkedList<E> {

	/** The serial version UID. */
	private static final long serialVersionUID = 1L;

	/**Creates a new sorted array list.
	 * 
	 */
	public SortedLinkedList() {
		// TODO Auto-generated constructor stub
	}

	/**Adds an element to the list in sorted order.
	 * 
	 */
	@Override
	public boolean add(E element) {
		super.add(findIndex(element), element);
		return true;
	}
	
	/**Finds the right location for the element.
	 * 
	 * @param element the element being added
	 * @return the proper index for the location
	 */
	private int findIndex(E element) {
		for(int i = 0; i < size(); i++) {
			if(this.get(i).compareTo(element) > 0) {
				return i;
			}
		}
		return size();
		
//		E current = this.get(size()/2);
//		if(current.compareTo(element) > 1) {
//			
//		} else if (current.compareTo(element) > 1)
//		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String list = "[";
		for(int i = 0; i < size() - 1; i++) {
			list += this.get(i).toString() + ",";
		}
		list += this.get(size() - 1) + "]";
		return list;
	}
	
	
	
}
