package etc.api.collection.list;

import java.util.LinkedList;


public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("1번마");
		list.add("2번마");
		list.add("3번마");
		
		list.addFirst("맨 앞");
		list.addLast("맨 뒤");
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.remove(0);
		System.out.println(list);
		
		//LIFO -> last in first out -> stack
		//push,pop,peek
		list.push("0번마"); //앞에서부터 추가하는메서드
		System.out.println(list);
		
		//삭제하면서 데이터를 읽기
		System.out.println(list.pop()); // 가장 마지막에 입력을 준 값을 빠져나오게 해서 보여준다.
		System.out.println(list);
		
		//삭제하지 않으면서 읽기
		System.out.println(list.peek());
		System.out.println(list);
		
		//FIFO -> first in first out -> Queue
		//offer,poll,peek
		
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list);
		
		System.out.println(list.poll());
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list);

	}

}
