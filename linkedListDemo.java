import java.util.*;//p-448
class linkedListDemo{
	public static void main(String[]args){
		LinkedList<String>ll=new LinkedList<String>();
		System.out.println("initill size of ll:"+ll.size());
		ll.add("C");
		ll.add("A");
		ll.add("E");
		ll.add("B");
		ll.add("D");
		ll.add("F");
		ll.add(1,"A2");
		System.out.println("original contents ll:"+ll);
		ll.remove("F");
		ll.remove(2);
		System.out.println("contents of ll after deletion:"+ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last:"+ll);
		String val=ll.get(2);
		ll.set(2,val+"-changed");
		System.out.println("ll after change:"+ll);
		
	}
}