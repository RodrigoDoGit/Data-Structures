import java.util.Arrays;

public class ED232{
    public static void main(String[] args){
	SinglyLinkedList<Integer> l1 = new SinglyLinkedList<>();
	SinglyLinkedList<Character> l2 = new SinglyLinkedList<>();
	SinglyLinkedList<String> l3 = new SinglyLinkedList<>();
	SinglyLinkedList<Integer> l4 = new SinglyLinkedList<>();
	SinglyLinkedList<Integer> l5 = new SinglyLinkedList<>();
	SinglyLinkedList<Character> l6 = new SinglyLinkedList<>();
	SinglyLinkedList<String> l7 = new SinglyLinkedList<>();
	SinglyLinkedList<Character> l8 = new SinglyLinkedList<>();
	SinglyLinkedList<Character> l9 = new SinglyLinkedList<>();
	SinglyLinkedList<Integer> l10 = new SinglyLinkedList<>();
	SinglyLinkedList<String> l11 = new SinglyLinkedList<>();
	SinglyLinkedList<Integer> l12 = new SinglyLinkedList<>();
	SinglyLinkedList<Character> l13 = new SinglyLinkedList<>();
	SinglyLinkedList<Character> l14 = new SinglyLinkedList<>();
	SinglyLinkedList<Character> l15 = new SinglyLinkedList<>();
	SinglyLinkedList<Integer> l16 = new SinglyLinkedList<>();
	SinglyLinkedList<String> l17 = new SinglyLinkedList<>();
	SinglyLinkedList<Integer> l18 = new SinglyLinkedList<>();

	for(int i=2; i<10; i+=2)
	    l1.addLast(i);

	l2.addLast('a');
	l2.addLast('b');
	l2.addLast('c');
	l3.addLast("edados");
	l5.addLast(2);
	l5.addLast(5);
	l5.addLast(1);
	l5.addLast(1);
	l5.addLast(2);
	l5.addLast(1);

	for(int i=0; i<4; i++)
	    l6.addLast('a');

	l7.addLast("estruturas");
	l7.addLast("de");
	l7.addLast("dados");

	for(int i=0; i<5; i++){
	    if(i % 2 == 0)
		l8.addLast('a');

	    else
		l8.addLast('n');
	}

	l8.addLast('s');
	l9.addLast('a');
	l9.addLast('b');
	l9.addLast('d');
	l9.addLast('a');
	l9.addLast('c');
	l10.addLast(42);
	l10.addLast(22);
	l10.addLast(42);
	l10.addLast(42);
	l10.addLast(22);
	l10.addLast(42);
	l11.addLast("ola");
	l11.addLast("ola");
	l11.addLast("mundo");
	l11.addLast("ola");
	l12.addLast(1);
	l12.addLast(2);
	l12.addLast(3);
	l12.addLast(3);
	l12.addLast(2);
	l12.addLast(1);
	l13.addLast('c');
	l13.addLast('a');
	l14.addLast('a');
	l15.addLast('a');
	l15.addLast('b');
	l15.addLast('c');
	l15.addLast('d');
	l15.addLast('e');
	l16.addLast(42);
	l16.addLast(1);
	l17.addLast("ola");
	l18.addLast(3);
	System.out.println("l1 = " + l1 + " | " + "l1.reverse() = " + l1.reverse());
	System.out.println("l2 = " + l2 + " | " + "l2.reverse() = " + l2.reverse());
	System.out.println("l3 = " + l3 + " | " + "l3.reverse() = " + l3.reverse());
	System.out.println("l4 = " + l4 + " | " + "l4.reverse() = " + l4.reverse());
	System.out.println("l5 = " + l5 + " | " + "l5.ocurrences(1) = " + Arrays.toString(l5.ocurrences(1)));
	System.out.println("l5 = " + l5 + " | " + "l5.ocurrences(2) = " + Arrays.toString(l5.ocurrences(2)));
	System.out.println("l5 = " + l5 + " | " + "l5.ocurrences(3) = " + Arrays.toString(l5.ocurrences(3)));
	System.out.println("l6 = " + l6 + " | " + "l6.ocurrences('a') = " + Arrays.toString(l6.ocurrences('a')));
	System.out.println("l7 = " + l7 + " | " + "l7.ocurrences('dados') = " + Arrays.toString(l7.ocurrences("dados")));
	System.out.println("l8 = " + l8 + " | " + "l8.ocurrences('a') = " + Arrays.toString(l8.ocurrences('a')));
	System.out.print("l9 antes de l9.remove({'c','a'}) = " + l9 + " | " + "l9 depois de l9.remove({'c','a'}) = ");
	l9.remove(l13);
	System.out.println(l9);
	l9.addFirst('a');
	l9.addLast('a');
	l9.addLast('c');
	System.out.print("l9 antes de l9.remove({'a'}) = " + l9 + " | " + "l9 depois de l9.remove({'a'}) = ");
	l9.remove(l14);
	System.out.println(l9);
	l9.removeAll('c');
	l9.addFirst('a');
	l9.addLast('a');
	l9.addLast('c');
	System.out.print("l9 antes de l9.remove({'a','b','c','d','e'}) = " + l9 + " | " + "l9 depois de l9.remove({'a','b','c','d','e'}) = ");
	l9.remove(l15);
	System.out.println(l9);
	System.out.print("l10 antes de l10.remove({42,1}) = " + l10 + " | " + "l10 depois de l10.remove({42,1}) = ");
	l10.remove(l16);
	System.out.println(l10);
	System.out.print("l11 antes de l11.remove('ola') = " + l11 + " | " + "l11 depois de l11.remove('ola') = ");
	l11.remove(l17);
	System.out.println(l11);
	System.out.print("l12 antes de l12.remove(3) = " + l12 + " | " + "l12 depois de l12.remove(3) = ");
	l12.remove(l18);
	System.out.println(l12);
    }
}
