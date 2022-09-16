public class ED195{
    public static boolean balanced(String s){
	if(s.length() % 2 != 0)
	    return false;

	MyStack<Character> tmp = new LinkedListStack<>();

	for(int i=0; i<s.length(); i++){
	    if(s.charAt(i) == '(' || s.charAt(i) == '[')
		tmp.push(s.charAt(i));

	    else if((s.charAt(i) == ')' && tmp.top() == '(') || (s.charAt(i) == ']' && tmp.top() == '['))
		tmp.pop();

	    else
		return false;
	}

	return true;
    }

    public static void main(String[] args){
	MyStack<Character> s1 = new LinkedListStack<>();
	MyStack<Character> s2 = new LinkedListStack<>();
	MyStack<Character> s3 = new LinkedListStack<>();	
	MyStack<Character> s4 = new LinkedListStack<>();
	MyStack<Character> s5 = new LinkedListStack<>();

	s1.push(')');
	s1.push(']');
	s1.push(')');
	s1.push('(');
	s1.push('[');
	s1.push('(');
	System.out.println("s1: " + s1);
	System.out.println("s1 balanced? " + balanced("([()])"));
	s2.push(']');
	s2.push(')');
	s2.push('(');
	s2.push(')');
	s2.push('(');
	s2.push('[');
	System.out.println("s2: " + s2);
	System.out.println("s2 balanced? " + balanced("[()()]"));
	s3.push(']');
	s3.push(')');
	s3.push('(');
	s3.push('(');
	System.out.println("s3: " + s3);
	System.out.println("s3 balanced? " + balanced("(()]"));
	s4.push(')');
	s4.push(']');
	s4.push('[');
	s4.push(')');
	s4.push('(');
	s4.push('[');
	System.out.println("s4: " + s4);
	System.out.println("s4 balanced? " + balanced("[()[])"));
	s5.push(']');
	s5.push('[');
	s5.push(')');
	s5.push('(');
	s5.push('[');
	System.out.println("s5: " + s5);
	System.out.println("s5 balanced? " + balanced("[()[]"));
    }
}
