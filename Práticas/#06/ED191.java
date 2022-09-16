public class ED191{
    public static void main(String[] args){
	SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
	SinglyLinkedList<Character> list1 = new SinglyLinkedList<>();
	SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

	list.addLast(1);
	list.addLast(2);
	list.addLast(3);
	System.out.println(list);
	list.duplicate();
	System.out.println(list);
	list1.addLast('a');
	list1.addLast('b');
	list1.addLast('c');
	list1.addLast('d');
	System.out.println(list1);
	list1.duplicate();
	System.out.println(list1);
	System.out.println(list2);
	list2.duplicate();
	System.out.println(list2);
    }
}
