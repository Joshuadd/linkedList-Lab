import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListLab {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Tulsa");
		list1.add("Ada");
		list1.add("BrokenArrow");
		list1.add("Owaso");
		System.out.println("Initial List 1: " + list1);
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("74104");
		list2.add("74135");
		list2.add("foo");
		list2.add("hello world");
		list2.add("777");
		System.out.println("Initial List 2: " + list2);
		
		LinkedList<String> mergedList = new LinkedList<String>();
		Iterator<String> list1Iter = list1.iterator();
		Iterator<String> list2Iter = list2.iterator();
		for(int i = 0; i < list1.size(); i++) {
			mergedList.add(list1Iter.next());
		}
		for(int i = 0; i < list2.size(); i++) {
			mergedList.add(list2Iter.next());
		}
		System.out.println("Merged List 2 into List 1: " + mergedList);
		
		list1Iter = list1.iterator();
		for(int i = 0; i < list1.size(); i+=2) {
			list1Iter.next();
			list1Iter.next();
			list1Iter.remove();
		}
		System.out.println("List 1 with every 2nd word removed: " + list1);
		
		LinkedList<String> list2DeepCopy = new LinkedList<String>();
		for(int i = 0; i < list2.size(); i++) {
			list2DeepCopy.add(list2.get(i));
		}
		System.out.println("Deep Copy of List 2: " + list2DeepCopy);
	}
}
