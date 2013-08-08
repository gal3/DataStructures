package implementLinkedList;

class Link{
	int data;
	Link nextLink;
	
	public Link(int _data){
		data = _data;
	}
}

class MyLinkedList{
	private Link llist = null;

	public MyLinkedList(){

	}
	
	public void addFirst(int data){
		Link l = new Link(data);
		l.nextLink = llist;
		llist = l;
	}
	
	public int removeFirst(){
		int ret = llist.data;
		llist = llist.nextLink;
		return ret;
	}
	
	public String toString(){
		Link curr = llist;
		StringBuilder sb = new StringBuilder();
		while(curr!=null){
			sb.append(curr.data);
			sb.append(",");
			curr = curr.nextLink;
		}
		return sb.substring(0, sb.length()-1); //ignore last comma
	}
}

public class ImplementLinkedList {
	
	public static void main(String[] args){
		MyLinkedList ll = new MyLinkedList();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
	}
}
