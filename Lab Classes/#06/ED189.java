public class ED189{
    public static void main(String[] args){
	SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
	SinglyLinkedList<Character> list1 = new SinglyLinkedList<>();
	SinglyLinkedList<String> list2= new SinglyLinkedList<>();

	list.addLast(2);
	list.addLast(4);
	list.addLast(6);
	System.out.println(list);
	System.out.println(list.remove(0));
        System.out.println(list);
	list1.addLast('a');
	list1.addLast('b');
	list1.addLast('c');
	list1.addLast('d');
	System.out.println(list1);
	System.out.println(list1.remove(2));
	System.out.println(list1);
	list2.addLast("estruturas");
	list2.addLast("de");
	list2.addLast("dados");
	System.out.println(list2);
	System.out.println(list2.remove(-1));
	System.out.println(list2.remove(3));
	System.out.println(list2);
    }
}
