public class ED196{
    public static void process(MyQueue<String> q, MyQueue<String> a, MyQueue<String> b){
	String names = "";
	String list = "";

	while(q.size() > 0){
	    names += q.dequeue();
	    list += q.dequeue();

	    if(list.equals("A"))
		a.enqueue(names);
	    
	    else if(list.equals("B"))
		b.enqueue(names);

	    else{
		if(a.size() < b.size())
		    a.enqueue(names);

		else if(b.size() < a.size())
		    b.enqueue(names);

		else {}
	    }

	    names = "";
	    list = "";
	}
    }

    public static void main(String[] args){
	MyQueue<String> q1 = new LinkedListQueue<>();
	MyQueue<String> q2 = new LinkedListQueue<>();
	MyQueue<String> q3 = new LinkedListQueue<>();
	MyQueue<String> q4 = new LinkedListQueue<>();
	MyQueue<String> q5 = new LinkedListQueue<>();
	MyQueue<String> q6 = new LinkedListQueue<>();

	q1.enqueue("Luis");
	q1.enqueue("B");
	q1.enqueue("Pedro");
	q1.enqueue("A");
	q1.enqueue("Luisa");
	q1.enqueue("A");
	q1.enqueue("Joao");
	q1.enqueue("X");
	q1.enqueue("Jose");
	q1.enqueue("X");
	q1.enqueue("Miguel");
	q1.enqueue("B");
	System.out.println("q1 inicial: " + q1);
	System.out.println("q2 inicial: " + q2);
	System.out.println("q3 inicial: " + q3);
	process(q1, q2, q3);
	System.out.println("q1 final: " + q1);
	System.out.println("q2 final: " + q2);
	System.out.println("q3 final: " + q3);
	q4.enqueue("Luis");
	q4.enqueue("B");
	q4.enqueue("Pedro");
	q4.enqueue("B");
	q4.enqueue("Luisa");
	q4.enqueue("X");
	q4.enqueue("Joao");
	q4.enqueue("X");
	System.out.println("q4 inicial: " + q4);
	System.out.println("q5 inicial: " + q5);
	System.out.println("q6 inicial: " + q6);
	process(q4, q5, q6);
	System.out.println("q4 final: " + q4);
	System.out.println("q5 final: " + q5);
	System.out.println("q6 final: " + q6);
    }
}
