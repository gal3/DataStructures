import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;

public class testCollection {

	public static void testArrays(){
		//create random array
		Integer[] arr = {6,1,2,4,5,3,3};
		//print the values
		for(Integer i : arr){
			System.out.println(i);
		}
		//remove duplicates by converting to set
		Set<Integer> mySet = new LinkedHashSet<Integer>(Arrays.asList(arr));
		System.out.println(mySet);
		//convert back to array
		arr = mySet.toArray(new Integer[0]);		
		for(Integer i : arr){
			System.out.println(i);
		}
	}
	
	public static void testSet(){
		String[] s = {"Hello", "world", "Hello", "boy", "goodbye", "boy"};
		Set<String> mySet = new LinkedHashSet<String>();
		for(String i : s){
			if(!mySet.add(i)){
				System.out.println("duplicite:" + i);
			}
		}
		System.out.println("distinct: " + mySet);
	}
	
	public static void testList(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(2);
        Collections.sort(list);
        list.remove(list.indexOf(2));
        System.out.println(list);
	}
	
	public static void testStack(){
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
	
	public static void testQueue(){
		ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		while(!queue.isEmpty()){
			System.out.println(queue.removeFirst());
		}
		
		LinkedList<Integer> queue2 = new LinkedList<Integer>();
		queue2.add(1);
		queue2.add(2);
		queue2.add(3);
		queue2.add(4);
		queue2.add(5);
		while(!queue2.isEmpty()){
			System.out.println(queue2.removeFirst());
		}
	}
	
	public static void testTreeMap(){
		// Create a hash map
	      TreeMap<String,Double> tm = new TreeMap<String,Double>();
	      // Put elements to the map
	      tm.put("Zara", new Double(3434.34));
	      tm.put("Mahnaz", new Double(123.22));
	      tm.put("Ayan", new Double(1378.00));
	      tm.put("Daisy", new Double(99.22));
	      tm.put("Qadir", new Double(-19.08));
	      
	      for (Map.Entry<String, Double> entry : tm.entrySet()) {
	           System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	      }
	      
	      System.out.println();
	      // Deposit 1000 into Zara's account
	      double balance = ((Double)tm.get("Zara")).doubleValue();
	      tm.put("Zara", new Double(balance + 1000));
	      System.out.println("Zara's new balance: " +tm.get("Zara"));
	}
	
	
	public static Comparator<Integer> IntegerComparator = new Comparator<Integer>() {
		
		public int compare(Integer int1, Integer int2) {
		
		//ascending order
//		return int1.compareTo(int2);

		//descending order
		return int2.compareTo(int1);
		}
		
	};
	
	public static void testPriorityQueue(){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(5, IntegerComparator);
		pq.add(1);
		pq.add(4);
		pq.add(3);
		pq.add(2);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
	}
	
	public static void main(String[] args) {
//		testArrays();
//		testSet();
//		testList();
//		testStack();
//		testQueue();
//		testTreeMap();
//		testPriorityQueue();

//		int[] a = {1,2,0,6,7,3,3,4,5,9,8,2,0,6,7,3,3,4,5,9,8,2,0,6,7,3,3,4,5,9,8};
//		int[] left = Arrays.copyOfRange(a, 0, 1);
//		int[] right = Arrays.copyOfRange(a, 3, a.length);
	}

}
