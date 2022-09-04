public class ED197{
    public static MyQueue<Integer> merge(MyQueue<Integer> a, MyQueue<Integer> b){
	MyQueue<Integer> q = new LinkedListQueue<>();
	int tmp;

	while(!a.isEmpty() && !b.isEmpty()){
	    if(a.first() <= b.first())
		tmp = a.dequeue();

	    else
		tmp = b.dequeue();

	    q.enqueue(tmp);
	}

	while(!a.isEmpty())
	    q.enqueue(a.dequeue());

	while(!b.isEmpty())
	    q.enqueue(b.dequeue());

	return q;
    }

    public static void main(String[] args){
	MyQueue<Integer> a1 = new LinkedListQueue<>();
	MyQueue<Integer> b1 = new LinkedListQueue<>();
	MyQueue<Integer> a2 = new LinkedListQueue<>();
	MyQueue<Integer> b2 = new LinkedListQueue<>();
	MyQueue<Integer> r1 = new LinkedListQueue<>();
	MyQueue<Integer> r2 = new LinkedListQueue<>();

	a1.enqueue(2);
	a1.enqueue(4);
	a1.enqueue(8);
	a1.enqueue(10);
	b1.enqueue(1);
	b1.enqueue(4);
	b1.enqueue(9);
	System.out.println("a1 = " + a1);
	System.out.println("b1 = " + b1);
	r1 = merge(a1, b1);
	System.out.println("merge(a1, b1) = " + r1);
	a2.enqueue(1);
	a2.enqueue(2);
	a2.enqueue(4);
	a2.enqueue(5);
	b2.enqueue(2);
	b2.enqueue(3);
	b2.enqueue(5);
	b2.enqueue(6);
	b2.enqueue(8);
	System.out.println("a2 = " + a2);
	System.out.println("b2 = " + b2);
	r2 = merge(a2, b2);
	System.out.println("merge(a2, b2) = " + r2);
    }
}
