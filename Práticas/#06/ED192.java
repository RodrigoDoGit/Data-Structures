public class ED192{
    public static void main(String[] args){
	SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
	SinglyLinkedList<String> list1 = new SinglyLinkedList<>();

	list.addLast(42);
	list.addLast(200);
	list.addLast(42);
	list.addLast(9999);
	list.addLast(42);
	list.addLast(200);
	list.addLast(42);
	System.out.println(list.count(42));
	System.out.println(list.count(200));
	System.out.println(list.count(9999));
	System.out.println(list.count(1));
	list1.addLast("cc");
	list1.addLast("cc");
	list1.addLast("cc");	
	list1.addLast("cc");
	list1.addLast("cc");
	System.out.println(list1.count("cc"));
    }
}
