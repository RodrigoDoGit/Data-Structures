public class ED190{
    public static void main(String[] args){
	SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
	SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
	SinglyLinkedList<String> list2 = new SinglyLinkedList<>();

	list.addLast(2);
	list.addLast(4);
	list.addLast(6);
	list.addLast(8);
	System.out.println(list);

	SinglyLinkedList<Integer> list3 = new SinglyLinkedList<>();

	list3 = list.copy();
	System.out.println(list3);
	System.out.println(list1);

	SinglyLinkedList<Integer> list4 = new SinglyLinkedList<>();

	list4 = list1.copy();
	System.out.println(list4);
	list2.addLast("estruturas");
	list2.addLast("de");
	list2.addLast("dados");
	System.out.println(list2);

	SinglyLinkedList<String> list5 = new SinglyLinkedList<>();

	list5 = list2.copy();
	System.out.println(list5);
    }
}
