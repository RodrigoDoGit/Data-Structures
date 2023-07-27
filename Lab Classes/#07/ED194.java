public class ED194{
    public static void reverse(MyStack<Integer> s, int n){
	int tmp[] = new int[s.size()];

	for(int i=0; i<n; i++)
	    tmp[i] = s.pop();

	for(int i=0; i<n; i++)
	    s.push(tmp[i]);
    }

    public static void main(String[] args){
	MyStack<Integer> s1 = new LinkedListStack<>();
	MyStack<Integer> s2 = new LinkedListStack<>();
	MyStack<Integer> s3 = new LinkedListStack<>();
	MyStack<Integer> s4 = new LinkedListStack<>();

	for(int i=5; i>0; i--)
	    s1.push(i);

	for(int i=8; i>1; i-=2)
	    s2.push(i);

	for(int i=3; i>0; i--)
	    s3.push(i);

	for(int i=20; i>10; i--)
	    s4.push(i);

	System.out.println(s1);
	reverse(s1, 3);
	System.out.println(s1);
	System.out.println(s2);
	reverse(s2, 4);
	System.out.println(s2);
	System.out.println(s3);
	reverse(s3, 1);
	System.out.println(s3);
	System.out.println(s4);
	reverse(s4, 6);
	System.out.println(s4);
    }
}
