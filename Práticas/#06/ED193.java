public class ED193{
    public static void main(String[] args){
	SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
	SinglyLinkedList<String> list1 = new SinglyLinkedList<>();

	list.addLast(1);
	list.addLast(2);
	list.addLast(2);
	list.addLast(2);
	list.addLast(1);
	list.addLast(3);
	list.addLast(4);
	list.addLast(2);
	list.addLast(1);
	System.out.println(list);
	list.removeAll(1);
	System.out.println(list);
	list.removeAll(2);
	System.out.println(list);
	list.removeAll(3);
	System.out.println(list);
	list.removeAll(5);
	System.out.println(list);

	for(int i=0; i<5;i++)
	    list1.addLast("cc");

	System.out.println(list1);
	list1.removeAll("cc");
	System.out.println(list1);
    }
}
